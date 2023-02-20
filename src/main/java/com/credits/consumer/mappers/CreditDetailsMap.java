package com.credits.consumer.mappers;

import com.credits.consumer.dto.request.CreditDetailsReq;
import com.credits.consumer.entity.CreditDetails;

public class CreditDetailsMap {


    public static CreditDetails convertToCreditDetails(CreditDetailsReq creditDetailsReq){
        CreditDetails creditDetails = new CreditDetails();
        creditDetails.setAmount(creditDetailsReq.getAmount());
        creditDetails.setCommission(creditDetailsReq.getComission());
        creditDetails.setCurrencyId(creditDetailsReq.getCurrencyId());
        creditDetails.setInterestRate(creditDetailsReq.getInterestRate());
        creditDetails.setTerms(creditDetailsReq.getTerms());

        return creditDetails;
    }
}
