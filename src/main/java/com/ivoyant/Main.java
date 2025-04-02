package com.ivoyant;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        // IOC Container is getting created and reading bean definitions from spring.xml
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        // Bean Retrieval: Getting the 'doctor' bean from the container and storing it in an interface reference.
        Staff staff = (Doctor) context.getBean(Doctor.class);

        // Method calling through interface reference
        staff.assist();            // Method in Doctor class
        staff.qualification();     // Method in Doctor class (Polymorphism in action)

        System.out.println();

        // Accessing the same 'doctor' bean again but using class type reference
        Doctor doc = (Doctor) context.getBean(Doctor.class);

        // Calling Doctor-specific methods
        doc.qualification();
        doc.assist();
        System.out.println("Name : " + doc.getName()); // Accessing property injected <property name="name"/>

        System.out.println();

        // Retrieving 'nurse' bean from IOC container.
        Nurse nurse = (Nurse) context.getBean("nurse");

        // Nurse methods
        nurse.assist();
        nurse.qualification();

        // Dependency Injection: Nurse has a dependency on Doctor
        System.out.println("Mentor name : " + nurse.getDoctor().getName()); // Showing the doctor's name injected into nurse

        Patient patient = context.getBean(Patient.class);
        patient.assistenc();
    }
}
