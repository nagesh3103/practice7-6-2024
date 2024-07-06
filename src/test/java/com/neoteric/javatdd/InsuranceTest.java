package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class InsuranceTest {
    @Test
    public void test(){
        Insurance details1 = new Insurance();
        details1.fullName="Bollempalli Nagesh";
        details1.dob="31/03/1998";
        details1.gender="Male";
        details1.maritalStatus="Unmarried";
        details1.address="Hyd";
        details1.phoneNumber=8686024836L;
        details1.email="abc@yahoo.com";
        details1.employerName="Neoteric";
        details1.annualIncome=10.5;  // in lakhs
        details1.planType="Basic";
        details1.dependentName="xyz";
        details1.dependentDOB="04/04/1998";
        details1.dependentGender="female";
        details1.preExistingConditions=false;

    }
}
