package com.neoteric.bankaccount.model;

public class MyAddress {
    public String flatNo;
    public String street;
    public String area;
    public String city;
    public String pincode;

    @Override
    public String toString() {
        return "MyAddress{" +
                "flatNo='" + flatNo + '\'' +
                ", street='" + street + '\'' +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
