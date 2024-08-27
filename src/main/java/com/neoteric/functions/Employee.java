package com.neoteric.functions;

import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    public double ctc;
    private String position;
    private int employeeId;
    public List<WorkHistory> workHistorylist;
    public WorkHistory currentMonthWorkHistory;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }



    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }
}


