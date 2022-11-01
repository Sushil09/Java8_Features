package com.sjsushil09.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUisngLambda {

    public static void main(String[] args) {
        Employee e1=new Employee("Varun", "Sharma",24);
        Employee e2=new Employee("Sushil", "Jaiswal",25);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

//        Collections.sort(employeeList, (x1, x2)  -> x2.getAge() -x1.getAge());

        for(Employee e: employeeList)
            System.out.println(e);

    }
}

class Employee{
    private String firstName;
    private String lastName;
    private int age;

    public Employee() {

    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

