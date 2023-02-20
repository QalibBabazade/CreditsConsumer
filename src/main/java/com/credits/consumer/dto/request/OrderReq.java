package com.credits.consumer.dto.request;

import java.io.Serializable;
import java.util.List;

public class OrderReq implements Serializable {

    private CreditDetailsReq creditDetails;
    private CustomerDetailsReq customerDetails;
    private List<CustomerDetailsReq> guaranteeList;
    private UserReq user;

    public CreditDetailsReq getCreditDetails() {
        return creditDetails;
    }

    public void setCreditDetails(CreditDetailsReq creditDetails) {
        this.creditDetails = creditDetails;
    }

    public CustomerDetailsReq getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetailsReq customerDetails) {
        this.customerDetails = customerDetails;
    }

    public List<CustomerDetailsReq> getGuaranteeList() {
        return guaranteeList;
    }

    public void setGuaranteeList(List<CustomerDetailsReq> guaranteeList) {
        this.guaranteeList = guaranteeList;
    }

    public UserReq getUser() {
        return user;
    }

    public void setUser(UserReq user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "creditDetails=" + creditDetails +
                ", customerDetails=" + customerDetails +
                ", guaranteeList=" + guaranteeList +
                ", user=" + user +
                '}';
    }
}
