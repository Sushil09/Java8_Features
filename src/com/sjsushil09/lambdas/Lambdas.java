package com.sjsushil09.lambdas;

public class Lambdas {
    public static void main(String[] args) {
        Test t1=()-> System.out.println("Hello");
        t1.print();
        t1.m2();
        Test.m1();
    }
}

@FunctionalInterface
interface Test{
    void print();
    static void m1(){
        System.out.println("Testing static method");
    }
    default void m2(){
        System.out.println("Default method");
    }
}
