package com.credits.consumer.mappers;

import com.credits.consumer.dto.request.CustomerDetailsReq;
import com.credits.consumer.entity.CustomerDetails;

public class CustomerDetailsMap {

    public static CustomerDetails convertToCustomerDetails(CustomerDetailsReq customerDetailsReq) {
        CustomerDetails customerDetails = new CustomerDetails();
        customerDetails.setFirstName(customerDetails.getFirstName());
        customerDetails.setMiddleName(customerDetailsReq.getMiddleName());
        customerDetails.setLastName(customerDetailsReq.getLastName());
        customerDetails.setCurrentAddress(customerDetailsReq.getCurrentAddress());
        customerDetails.setDocFin(customerDetailsReq.getDocFin());
        customerDetails.setIncome(customerDetailsReq.getIncome());
        customerDetails.setOtherIncome(customerDetailsReq.getOtherIncome());
        customerDetails.setPosition(customerDetailsReq.getPosition());
        customerDetails.setFamilyMemberCount(customerDetailsReq.getFamilyMembersCount());
        customerDetails.setWorkExperience(customerDetailsReq.getWorkExperience());
        customerDetails.setWorkPlace(customerDetailsReq.getWorkPlace());

        return customerDetails;
    }
}
