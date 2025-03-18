package com.ivoyant.oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpName("Suprith");
        emp.setEmpID(101);
        emp.setGender("Male");
        emp.setSalary(35000);

        System.out.println("Employee ID : "+emp.getID());
        System.out.println("Employee name : "+emp.getEmpName());
        System.out.println("Employee gender : "+emp.getGender());
        System.out.println("Employee salary : "+emp.getSalary());
    }
}

