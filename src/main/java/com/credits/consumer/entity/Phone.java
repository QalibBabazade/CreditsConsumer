package com.credits.consumer.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "phone")
@DynamicInsert
public class Phone implements Serializable {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String description;
        private String phoneNumber;

        @ColumnDefault(value = "1")
        private Integer active;

        @CreationTimestamp
        private Date createDate;
        private Date updateDate;

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "customer_detail_id")
        private CustomerDetails customerDetails;


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
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

        public CustomerDetails getCustomerDetails() {
                return customerDetails;
        }

        public void setCustomerDetails(CustomerDetails customerDetails) {
                this.customerDetails = customerDetails;
        }
}
