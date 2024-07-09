package com.neoteric.bankaccount.model;

public class AccountDetails {
    public String accountNumber;
    public String iifscCode;

    @Override
    public String toString() {
        return "AccountDetails{" +
                "accountNumber='" + accountNumber + '\'' +
                ", iifscCode='" + iifscCode + '\'' +
                '}';
    }
}
