package com.ivoyant.oops.encapsulation;

public class Employee {
    private int empID;
    private String empName;
    private String gender;
    private int salary;

    //Getter methods for returning the preferred values.

    public int getID(){
        return empID;
    }
    public String getEmpName(){
        return empName;
    }
    public String getGender(){
        return gender;
    }
    public int getSalary(){
        return salary;
    }

    //setters for setting the values for the variables which we have considered.
    public void setEmpID(int empID){
        this.empID = empID;
    }
    public void setEmpName(String empName){
        this.empName = empName;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
}
