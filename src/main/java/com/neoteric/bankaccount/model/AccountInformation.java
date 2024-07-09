package com.neoteric.bankaccount.model;

public class AccountInformation {
    public String typeOfAccount;
    public int initialDeposit;

    @Override
    public String toString() {
        return "AccountInformation{" +
                "typeOfAccount='" + typeOfAccount + '\'' +
                ", initialDeposit=" + initialDeposit +
                '}';
    }
}