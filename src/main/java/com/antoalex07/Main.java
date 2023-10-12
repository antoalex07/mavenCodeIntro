package com.antoalex07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.antoalex07.demo.Doctor;
import com.antoalex07.demo.Nurse;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doctor = context.getBean(Doctor.class);

        doctor.assist();
        System.out.println(doctor.getQualification());

        Nurse nurse = (Nurse) context.getBean("nurse");

        nurse.Assist();


    }
}