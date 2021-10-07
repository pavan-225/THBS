package com.torryharris.emppack;

public class Manager extends Employee{

    private String deptName;
    private int empcount;
    public Manager(int empId, String empName, int sal, String deptName, int empcount) {
        super(empId, empName, sal);
        this.deptName=deptName; //Constructor chaining , base class constructor evoked
        //within the derived class constuctor // using super() method
        this.empcount=empcount;
    }

    @Override
    public String getDetails()  // override the function from the base class
    {
        return(super.getDetails()+"  "+deptName+"  "+empcount);
    }

    public String getDeptName() {
        return deptName;
    }

    public int getEmpcount() {
        return empcount;
    }
}
