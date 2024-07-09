package com.neoteric.javatdd.service;

import com.neoteric.javatdd.model.Address;
import com.neoteric.javatdd.model.Admission;
import com.neoteric.javatdd.model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentServiceTest {

    @Test

        public void ageGreaterThanSix(){
            Student student1 = new Student();
            student1.firstName="Venkat";
            student1.age=7;
            student1.standard="1";
            Address student1Address = new Address();
            student1Address.area="miyapur";
            student1Address.city="hyd";
            student1Address.flatNo="101";
            student1Address.pincode="12345";
            student1Address.street="kphb";

            student1.address=student1Address;

            StudentService service = new StudentService();

            Admission admission= service.getAdmission(student1);
            Assertions.assertEquals(1000,admission.fee);
            Assertions.assertNotNull(admission.rollNumber);

        }

    @Test

    public void ageLessThanSix(){
        Student student1 = new Student();
        student1.firstName="Venkat";
        student1.age=6;
        student1.standard="1";
        Address student1Address = new Address();
        student1Address.area="miyapur";
        student1Address.city="hyd";
        student1Address.flatNo="101";
        student1Address.pincode="12345";
        student1Address.street="kphb";

        student1.address=student1Address;

        StudentService service = new StudentService();

        Admission admission= service.getAdmission(student1);
        Assertions.assertNull(admission);


    }
    }
