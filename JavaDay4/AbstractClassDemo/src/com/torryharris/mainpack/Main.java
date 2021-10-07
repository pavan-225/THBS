package com.torryharris.mainpack;
import com.torryharris.emppack.Employee;
import com.torryharris.emppack.Manager;
import com.torryharris.emppack.Programmer;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // write your code here
        Employee employee = new Employee(100,"Pavan",50000);
        System.out.println(employee.getDetails());

        Manager m1 = new Manager(200,"rajesh",20000,"HR",5);
        System.out.println(m1.getDetails());

        Employee[] emp=new Employee[2];
        emp[0]=new Manager(123,"Lalit",8000,"KKu",8);
        emp[1]=new Manager(123,"Jadhav",5000,"HR",1);

        for(Employee e:emp){
            System.out.println(e+get);
        }



    }
}
