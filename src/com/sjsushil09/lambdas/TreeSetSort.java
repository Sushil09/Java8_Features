package com.sjsushil09.lambdas;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSort {
    public static void main(String[] args) {
        Employee e1=new Employee("Varun", "Sharma",24);
        Employee e2=new Employee("Sushil", "Jaiswal",25);
        Set<Employee> treeSet = new TreeSet<>((x1,x2)->x1.getAge()-x2.getAge());
        treeSet.add(e1);
        treeSet.add(e2);
        System.out.println(treeSet);

    }
}

class MyComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return  -(o1.getAge() -o2.getAge());
    }
}
