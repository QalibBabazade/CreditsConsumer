package com.credits.consumer.entity;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "customer_details")
@DynamicInsert
public class CustomerDetails implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String firstName;
        private String lastName;
        private String middleName;
        private String docFin;
        private String currentAddress;

        private Integer familyMemberCount;

        private BigDecimal income;
        private BigDecimal otherIncome;

        private String workPlace;
        private String position;
        private Integer workExperience;

        @ColumnDefault(value = "1")
        private Integer active;

        @CreationTimestamp
        private Date createDate;
        private Date updateDate;

        @OneToMany(fetch = FetchType.LAZY)
        private List<Phone> phoneList;

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "customerDetails")
        private List<Order> orders;


        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getMiddleName() {
                return middleName;
        }

        public void setMiddleName(String middleName) {
                this.middleName = middleName;
        }

        public String getDocFin() {
                return docFin;
        }

        public void setDocFin(String docFin) {
                this.docFin = docFin;
        }

        public String getCurrentAddress() {
                return currentAddress;
        }

        public void setCurrentAddress(String currentAddress) {
                this.currentAddress = currentAddress;
        }

        public Integer getFamilyMemberCount() {
                return familyMemberCount;
        }

        public void setFamilyMemberCount(Integer familyMemberCount) {
                this.familyMemberCount = familyMemberCount;
        }

        public BigDecimal getIncome() {
                return income;
        }

        public void setIncome(BigDecimal income) {
                this.income = income;
        }

        public BigDecimal getOtherIncome() {
                return otherIncome;
        }

        public void setOtherIncome(BigDecimal otherIncome) {
                this.otherIncome = otherIncome;
        }

        public String getWorkPlace() {
                return workPlace;
        }

        public void setWorkPlace(String workPlace) {
                this.workPlace = workPlace;
        }

        public String getPosition() {
                return position;
        }

        public void setPosition(String position) {
                this.position = position;
        }

        public Integer getWorkExperience() {
                return workExperience;
        }

        public void setWorkExperience(Integer workExperience) {
                this.workExperience = workExperience;
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

        public List<Phone> getPhoneList() {
                return phoneList;
        }

        public void setPhoneList(List<Phone> phoneList) {
                this.phoneList = phoneList;
        }

        public List<Order> getOrders() {
                return orders;
        }

        public void setOrders(List<Order> orders) {
                this.orders = orders;
        }
}
