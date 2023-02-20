package com.credits.consumer.mappers;

import com.credits.consumer.dto.request.PhoneReq;
import com.credits.consumer.entity.Phone;

public class PhoneDetailsMap {

    public static Phone convertToPhone(PhoneReq phoneReq){
        Phone phone = new Phone();
        phone.setDescription(phoneReq.getDescripiton());
        phone.setPhoneNumber(phoneReq.getPhoneNumber());
        return phone;
    }
}
