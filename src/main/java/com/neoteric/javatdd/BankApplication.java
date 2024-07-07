package com.neoteric.javatdd;

public class BankApplication {
    String firstName;
    String lastName;
    String nameOfBank;
    String address;
    long accountNumber;
    long contactNumber;

    @Override
    public String toString() {
        return "BankApplication{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nameOfBank='" + nameOfBank + '\'' +
                ", address='" + address + '\'' +
                ", accountNumber=" + accountNumber +
                ", contactNumber=" + contactNumber +
                ", nameOfReferee='" + nameOfReferee + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    String nameOfReferee;
    String date;
}
