package com.neoteric.bankaccount.service;

import com.neoteric.bankaccount.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankServiceTest {

    @Test
    public void amountGreaterThan5000(){
        PersonalInformation customer1 = new PersonalInformation();
        customer1.fullName="Chandra";
        customer1.dateOfBirth="31/03/1998";
        customer1.aadharNumber=45612378;
        customer1.gender="Male";
        customer1.maritalStatus="Unmarried";
        customer1.nationality="Indian";
        System.out.println(customer1);

        ContactInformation nagesh = new ContactInformation();
        nagesh.email="xyz@yahoo.com";
        nagesh.phoneNumber=8686024836L;
        MyAddress chandraAddress= new MyAddress();
        chandraAddress.area="miyapur";
        chandraAddress.city="hyd";
        chandraAddress.flatNo="101";
        chandraAddress.pincode="12345";
        chandraAddress.street="kphb";

        nagesh.address=chandraAddress;
        System.out.println(nagesh);
        AccountInformation myAccount = new AccountInformation();
        myAccount.initialDeposit=5001;
        myAccount.typeOfAccount="Savings";
        System.out.println(myAccount);


        BankService service = new BankService();
        AccountDetails account = service.getAccount(myAccount);
        System.out.println(account);
        Assertions.assertNotNull(account.accountNumber);
        // return service;
    }
    @Test
    public void amountLessThan5000(){
        PersonalInformation customer1 = new PersonalInformation();
        customer1.fullName="Chandra";
        customer1.dateOfBirth="31/03/1998";
        customer1.aadharNumber=45612378;
        customer1.gender="Male";
        customer1.maritalStatus="Unmarried";
        customer1.nationality="Indian";
        System.out.println(customer1);

        ContactInformation nagesh = new ContactInformation();
        nagesh.email="xyz@yahoo.com";
        nagesh.phoneNumber=8686024836L;
        MyAddress chandraAddress= new MyAddress();
        chandraAddress.area="miyapur";
        chandraAddress.city="hyd";
        chandraAddress.flatNo="101";
        chandraAddress.pincode="12345";
        chandraAddress.street="kphb";

        nagesh.address=chandraAddress;
        System.out.println(nagesh);
        AccountInformation myAccount = new AccountInformation();
        myAccount.initialDeposit=4999;
        myAccount.typeOfAccount="Savings";
        System.out.println(myAccount);


        BankService service = new BankService();
        AccountDetails account = service.getAccount(myAccount);
        System.out.println(account);
        Assertions.assertNull(account);
        // return service;
    }
}