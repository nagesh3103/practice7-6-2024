package com.neoteric.javatdd;

import org.junit.jupiter.api.Test;

public class TicketsTest {


    @Test
    public void test(){
        MovieTickets details = new MovieTickets();
        details.fullName="BNC";
        details.email="abc@yahoo.com";
        details.phoneNumber=8686024836L;
        details.movieTitle="Kalki";
        details.theatre="PVR";
        details.date="7/6/24";
        details.time="9pm";
        details.noOfTickets=4;
        details.seatNumbers="a23,a24,a25,a26";
        details.seatType="vip";
        details.cardNumber=123456789;
        details.expiry="04/27";
        details.cvv=456;
        System.out.println(details);
    }
}
