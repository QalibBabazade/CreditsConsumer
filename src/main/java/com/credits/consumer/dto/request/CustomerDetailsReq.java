package com.credits.consumer.dto.request;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CustomerDetailsReq implements Serializable {
    private String currentAddress;
    private String docFin;
    private Integer familyMembersCount;
    private String firstName;
    private String lastName;
    private String middleName;
    private BigDecimal income;
    private BigDecimal otherIncome;
    private String position;
    private Integer workExperience;
    private String workPlace;
    private List<PhoneReq> phoneList;



    public String getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(String currentAddress) {
        this.currentAddress = currentAddress;
    }

    public String getDocFin() {
        return docFin;
    }

    public void setDocFin(String docFin) {
        this.docFin = docFin;
    }

    public Integer getFamilyMembersCount() {
        return familyMembersCount;
    }

    public void setFamilyMembersCount(Integer familyMembersCount) {
        this.familyMembersCount = familyMembersCount;
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

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public List<PhoneReq> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<PhoneReq> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "currentAddress='" + currentAddress + '\'' +
                ", docFin='" + docFin + '\'' +
                ", familyMembersCount=" + familyMembersCount +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", income=" + income +
                ", otherIncome=" + otherIncome +
                ", position='" + position + '\'' +
                ", workExperience=" + workExperience +
                ", workPlace='" + workPlace + '\'' +
                ", phoneList=" + phoneList +
                '}';
    }
}
