package com.credits.consumer.dto.request;

import java.io.Serializable;

public class PhoneReq implements Serializable {

    private String descripiton;
    private String phoneNumber;

    public String getDescripiton() {
        return descripiton;
    }

    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "descripiton='" + descripiton + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
