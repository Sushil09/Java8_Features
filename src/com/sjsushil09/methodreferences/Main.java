package com.sjsushil09.methodreferences;

public class Main {
    public static void main(String[] args) {
        Interf i = Main::m2;
        i.m1();
    }

    private static void m2(){
        System.out.println("Called method");
    }
}

interface Interf{
    void m1();
}
