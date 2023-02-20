package com.credits.consumer.dto.request;

import com.credits.consumer.enums.CurrencyEnum;

import java.io.Serializable;
import java.math.BigDecimal;

public class CreditDetailsReq implements Serializable {

    private BigDecimal amount;
    private Double comission;
    private CurrencyEnum currencyId;
    private Double interestRate;
    private Integer terms;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Double getComission() {
        return comission;
    }

    public void setComission(Double comission) {
        this.comission = comission;
    }

    public CurrencyEnum getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(CurrencyEnum currencyId) {
        this.currencyId = currencyId;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getTerms() {
        return terms;
    }

    public void setTerms(Integer terms) {
        this.terms = terms;
    }

    @Override
    public String toString() {
        return "CreditDetails{" +
                "amount=" + amount +
                ", comission=" + comission +
                ", currencyId=" + currencyId +
                ", interestRate=" + interestRate +
                ", terms=" + terms +
                '}';
    }
}
