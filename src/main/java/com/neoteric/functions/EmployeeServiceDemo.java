package com.neoteric.functions;

import java.util.Date;
import java.util.function.Function;

public class EmployeeServiceDemo {
    Function<Double,Integer> findTaxBracket = (ctc) ->{
        int taxPercentage=0;
        if (ctc<300000){
            return taxPercentage;
        } else if (ctc>=300000 && ctc<700000){
            taxPercentage=5;

        } else if (ctc>=700000 && ctc<100000) {
            taxPercentage=10;
        }
        return taxPercentage;

    };
    Function<Employee,PaySlip> calculateSalary = (emp) -> {
        double perMonthWages = emp.ctc/12;
        double perDayWages = perMonthWages/emp.currentMonthWorkHistory.noOfWorkinDays;
        double monthCTC = perDayWages * emp.currentMonthWorkHistory.noOfDaysPresent;
        int taxPercentage = findTaxBracket.apply(emp.ctc);
        double totalTax = (emp.ctc*taxPercentage)/100;
        double perMonthTax = totalTax/12;
        PaySlip paySlip = new PaySlip();
        paySlip.monthCTC=monthCTC;
        paySlip.actualAmount=monthCTC-perMonthTax;
        paySlip.paymonth=new Date();
        paySlip.monthTax=perMonthTax;
        return paySlip;
    };

    public static void main(String[] args) {
        EmployeeServiceDemo employeeServiceDemo = new EmployeeServiceDemo();
        Employee emp = new Employee("Chandra","Bollempalli",26);
        emp.ctc = 800000;
        WorkHistory workHistory = new WorkHistory();
        workHistory.month=new Date();
        workHistory.noOfWorkinDays=21;
        workHistory.noOfDaysPresent=15;
        workHistory.noOfLeaves=6;
        emp.currentMonthWorkHistory=workHistory;
        PaySlip paySlip = employeeServiceDemo.calculateSalary.apply(emp);
        System.out.println("Payslip details: "+ "Month "+paySlip.paymonth+ " MonthlyCtc "+paySlip.monthCTC + " TaxAmount "+paySlip.monthTax+" ActualAmount "+paySlip.actualAmount);
    }
}
