package com.credits.consumer.enums;

public enum CurrencyEnum {

    AZN(1),
    USD(2);

  private Integer value;

    CurrencyEnum(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
