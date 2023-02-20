package com.credits.consumer.entity;

import com.credits.consumer.enums.CurrencyEnum;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "credit_details")
@DynamicInsert
public class CreditDetails implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private BigDecimal amount;
        private Double commission;

        @Enumerated(EnumType.ORDINAL)
        private CurrencyEnum currencyId;

        private Double interestRate;
        private Integer terms;

        @ColumnDefault(value = "1")
        private Integer active;

        @CreationTimestamp
        private Date createDate;
        private Date updateDate;

        @OneToOne(fetch = FetchType.LAZY,mappedBy = "creditDetails")
        private Order order;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public BigDecimal getAmount() {
                return amount;
        }

        public void setAmount(BigDecimal amount) {
                this.amount = amount;
        }

        public Double getCommission() {
                return commission;
        }

        public void setCommission(Double commission) {
                this.commission = commission;
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

        public Integer getActive() {
                return active;
        }

        public void setActive(Integer active) {
                this.active = active;
        }

        public Date getCreateDate() {
                return createDate;
        }

        public void setCreateDate(Date createDate) {
                this.createDate = createDate;
        }

        public Date getUpdateDate() {
                return updateDate;
        }

        public void setUpdateDate(Date updateDate) {
                this.updateDate = updateDate;
        }

        public Order getOrder() {
                return order;
        }

        public void setOrder(Order order) {
                this.order = order;
        }
}
