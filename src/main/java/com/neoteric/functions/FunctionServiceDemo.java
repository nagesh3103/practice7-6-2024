package com.neoteric.functions;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionServiceDemo {

    Supplier<String> nameSupplierlamda = () ->"neoteric";

    Supplier<Employee> nameSupplier= () ->{
        Employee employee = new Employee("Chandra","Bollempalli",26);
        return employee;
    };

    Supplier<Car> carSupplier = () ->new Car("Suzuki","Alto","blue");

    Function<String,String> nameUpperCaseFunct = (name) ->{
        return name.toUpperCase();
    };

    BiFunction<String,String,String> biFunctonConcatFunc = (fname,lname) ->{
        return fname.concat(lname);
    };
    public String nameUpperCase(String name){
        return name.toUpperCase();
    }
    public String nameUpperCaseWithFunction(Function<String,String> upper,String name){
        return upper.apply(name);
    }



    public static void main(String[] args) {
        FunctionServiceDemo functionServiceDemo = new FunctionServiceDemo();
        String upperCaseName = functionServiceDemo.nameUpperCase("Neoteric");
        System.out.println("Output from method "+ upperCaseName);

        String upperCaseFunction = functionServiceDemo.nameUpperCaseFunct.apply("Neoteric");
        System.out.println("Output from function "+upperCaseFunction);

        String fullName = functionServiceDemo.biFunctonConcatFunc.apply("Neoteric","Method");
        System.out.println("Output from bifunction " + fullName);

        String upperCase = functionServiceDemo.nameUpperCaseWithFunction(functionServiceDemo.nameUpperCaseFunct,"neoteric");
        System.out.println("Output from function as parameter in method " + upperCase);

        String supplierFunc = functionServiceDemo.nameSupplierlamda.get();
        System.out.println("Output from supplier and get "+ supplierFunc);

        Employee myName = functionServiceDemo.nameSupplier.get();
        System.out.println("employee details Name: "+ myName.getFirstName());

        Car details = functionServiceDemo.carSupplier.get();
        System.out.println("car details: "+ details.getBrand()+" "+details.getColour() + " "+details.getModel());
    }
}
