package com.neoteric.bankaccount.service;

import com.neoteric.bankaccount.model.AccountDetails;
import com.neoteric.bankaccount.model.AccountInformation;

import java.util.UUID;

public class BankService {
    public AccountDetails getAccount(AccountInformation amount){
        AccountDetails account = null;
        if(amount.initialDeposit > 5000){
            account=new AccountDetails();
            account.accountNumber="ACC: " + UUID.randomUUID().toString();
            account.iifscCode="xyz123";
            System.out.println(account);
        }
        System.out.println(account);
        return account;
    }
}
