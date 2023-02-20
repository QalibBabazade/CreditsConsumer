package com.credits.consumer.service.business;

import com.credits.consumer.dto.request.CreditDetailsReq;
import com.credits.consumer.dto.request.CustomerDetailsReq;
import com.credits.consumer.dto.request.OrderReq;
import com.credits.consumer.dto.request.UserReq;
import com.credits.consumer.entity.*;
import com.credits.consumer.mappers.CreditDetailsMap;
import com.credits.consumer.mappers.CustomerDetailsMap;
import com.credits.consumer.mappers.PhoneDetailsMap;
import com.credits.consumer.mappers.UserDetailsMap;
import com.credits.consumer.service.functional.*;
import org.springframework.stereotype.Service;

@Service
public class OrderBusinessService {

    private final CreditFunctionalService creditFunctionalService;

    private final CustomerFunctionalService customerFunctionalService;

    private final OrderFunctionalService orderFunctionalService;

    private final OrderGuaranteeFunctionalService orderGuaranteeFunctionalService;

    private final UserFunctionalService userFunctionalService;

    private final PhoneFunctionalService phoneFunctionalService;

    public OrderBusinessService(CreditFunctionalService creditFunctionalService, CustomerFunctionalService customerFunctionalService,
                                OrderFunctionalService orderFunctionalService, OrderGuaranteeFunctionalService orderGuaranteeFunctionalService,
                                UserFunctionalService userFunctionalService, PhoneFunctionalService phoneFunctionalService) {
        this.creditFunctionalService = creditFunctionalService;
        this.customerFunctionalService = customerFunctionalService;
        this.orderFunctionalService = orderFunctionalService;
        this.orderGuaranteeFunctionalService = orderGuaranteeFunctionalService;
        this.userFunctionalService = userFunctionalService;
        this.phoneFunctionalService = phoneFunctionalService;
    }


    public void addOrder(OrderReq orderReq) {

        CreditDetailsReq creditDetailsReq = orderReq.getCreditDetails();
        CustomerDetailsReq customerDetailsReq = orderReq.getCustomerDetails();
        UserReq userReq = orderReq.getUser();
        /***************** Add Credits ***********************/
        CreditDetails creditDetails = CreditDetailsMap.convertToCreditDetails(creditDetailsReq);
        creditDetails = creditFunctionalService.addCreditDetails(creditDetails);
        /************************* Add Customer ********************************/
        CustomerDetails customerDetails = CustomerDetailsMap.convertToCustomerDetails(customerDetailsReq);
        customerDetails = customerFunctionalService.addCustomerDetails(customerDetails);
        /*********************Add Phone **********************************/
        addPhoneList(customerDetailsReq, customerDetails);
        /********************* Add User ***************************/
        User user = UserDetailsMap.convertToUser(userReq);
        user = userFunctionalService.addUser(user);
        /*****************Add Order *****************************/
        Order order = new Order();
        order.setCreditDetails(creditDetails);
        order.setCustomerDetails(customerDetails);
        order.setUser(user);
        order = orderFunctionalService.addOrder(order);
        /********************* Add Order Guarantee ********************************/
        OrderGuarantee orderGuarantee = new OrderGuarantee();
        orderGuarantee.setOrder(order);
        orderReq.getGuaranteeList().stream().map(c -> addPhoneList(c, customerFunctionalService.addCustomerDetails(CustomerDetailsMap.convertToCustomerDetails(c))))
                .forEach(orderGuarantee::setGuarantee);
        orderGuaranteeFunctionalService.addOrderGuarantee(orderGuarantee);
        /*************************************************/
     /*   List<CustomerDetailsReq> guaranteeReqList = orderReq.getGuaranteeList();
        for (CustomerDetailsReq guaranteeReq : guaranteeReqList) {
            CustomerDetails guarantee = CustomerDetailsMap.convertToCustomerDetails(guaranteeReq);
            guarantee = customerFunctionalService.addCustomerDetails(guarantee);
            orderGuarantee.setGuarantee(guarantee);

            addPhoneList(guaranteeReq, guarantee);

        }
        orderGuaranteeFunctionalService.addOrderGuarantee(orderGuarantee);*/
    }

    private CustomerDetails addPhoneList(CustomerDetailsReq customerDetailsReq, CustomerDetails customerDetails) {

        customerDetailsReq.getPhoneList().stream()
                .map(PhoneDetailsMap::convertToPhone)
                .forEach(phone -> {
                    phone.setCustomerDetails(customerDetails);
                    phoneFunctionalService.addPhone(phone);
                });
        return customerDetails;
      /*  List<PhoneReq> phoneReqList = customerDetailsReq.getPhoneList();
        for (PhoneReq phoneReq : phoneReqList) {
            Phone phone = PhoneDetailsMap.convertToPhone(phoneReq);
            phone.setCustomerDetails(customerDetails);
            phoneFunctionalService.addPhone(phone);
        }*/

    }
}
