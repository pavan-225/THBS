package com.torryharris.emppack;

public class Employee {

    protected int empId;
    protected String empName;
    protected int sal;

    public Employee(int empId, String empName, int sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }

    public String getDetails()
    {
        return(empId +"  "+empName+"  "+sal);
    }


    public double calnetsal(){
        return sal*12;
     }
}


