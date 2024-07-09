package com.neoteric.bankaccount.model;

public class PersonalInformation {
    public String fullName;
    public String dateOfBirth;
    public String gender;
    public String nationality;
    public String maritalStatus;
    public long aadharNumber;

    @Override
    public String toString() {
        return "PersonalInformation{" +
                "fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", aadharNumber=" + aadharNumber +
                '}';
    }
}
