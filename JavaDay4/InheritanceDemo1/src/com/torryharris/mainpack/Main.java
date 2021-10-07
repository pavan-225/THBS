package com.torryharris.mainpack;
import com.emppack.Employee;
import com.emppack.Manager;
import com.emppack.Programmer;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee employee = new Employee(100,"Pavan",50000);
        System.out.println(employee.getDetails());
        Manager m1 = new Manager(200,"rajesh",20000,"HR",5);
        System.out.println(m1.getDetails());
        Programmer p1 = new Programmer(400,"kiran",20000,3,"java");
        System.out.println(p1.getDetails());
        Employee e1 = new Manager(500,"Sam",40000,"iT",5);
        System.out.println(e1.getDetails());



    }
}
