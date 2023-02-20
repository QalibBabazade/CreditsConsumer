package com.credits.consumer.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders")
@DynamicInsert
public class Order implements Serializable {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ColumnDefault(value = "1")
        private Integer active;

        @CreationTimestamp
        private Date createDate;
        private Date updateDate;

        @OneToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "credit_details_id")
        private CreditDetails creditDetails;

        @ManyToOne( fetch = FetchType.LAZY)
        @JoinColumn(name = "customer_details_id")
        private CustomerDetails customerDetails;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "user_id")
        private User user;


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
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

        public CreditDetails getCreditDetails() {
                return creditDetails;
        }

        public void setCreditDetails(CreditDetails creditDetails) {
                this.creditDetails = creditDetails;
        }

        public CustomerDetails getCustomerDetails() {
                return customerDetails;
        }

        public void setCustomerDetails(CustomerDetails customerDetails) {
                this.customerDetails = customerDetails;
        }

        public User getUser() {
                return user;
        }

        public void setUser(User user) {
                this.user = user;
        }
}
