package com.neoteric.bankaccount.model;

public class ContactInformation {
    public MyAddress address;
    public long phoneNumber;
    public String email;

    @Override
    public String toString() {
        return "ContactInformation{" +
                "address=" + address +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
