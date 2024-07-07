package com.neoteric.javatdd;

public class MovieTickets {
    //Personal information
    String fullName;
    String email;
    double phoneNumber;

    //movie selection
    String movieTitle;
    String theatre;
    String date;
    String time;
    int noOfTickets;

    //seating preference
    String seatType;
    String seatNumbers;

    //payment details
    long cardNumber;
    String expiry;
    int cvv;

    @Override
    public String toString() {
        return "MovieTickets{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", movieTitle='" + movieTitle + '\'' +
                ", theatre='" + theatre + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", noOfTickets=" + noOfTickets +
                ", seatType='" + seatType + '\'' +
                ", seatNumbers='" + seatNumbers + '\'' +
                ", cardNumber=" + cardNumber +
                ", expiry='" + expiry + '\'' +
                ", cvv=" + cvv +
                '}';
    }
}
