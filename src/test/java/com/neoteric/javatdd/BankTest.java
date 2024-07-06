package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class BankTest {
    @Test
    public void test() {
        BankApplication details = new BankApplication();
        details.firstName="Nagesh";
        details.lastName="Bollempalli";
        details.nameOfBank="IDBI";
        details.address="hyd";
        details.accountNumber=123456789;
        details.contactNumber=8686024836L;
        details.date="6/7/24";
    }
}
