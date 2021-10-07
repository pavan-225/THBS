package com.emppack;

public class Programmer extends Employee {

    private int noOfProjects;
    private String skillSet;
    public Programmer(int empId, String empName, int sal, int noOfProjects, String skillSet) {
        super(empId, empName, sal);
        this.noOfProjects = noOfProjects;
        this.skillSet = skillSet;
    }

    @Override
    public String getDetails() {
        return "Programmer{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", sal=" + sal +
                ", noOfProjects=" + noOfProjects +
                ", skillSet='" + skillSet + '\'' +
                '}';
    }

    public int getNoOfProjects() {
        return noOfProjects;
    }

    public String getSkillSet() {
        return skillSet;
    }
}
