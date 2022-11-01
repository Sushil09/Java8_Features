package com.sjsushil09.lambdas;

import java.util.function.*;

public class DefaultMethodsInterfaces implements Right, Left{
    public static void main(String[] args) {
        Left left = new DefaultMethodsInterfaces();
        left.m1();
    }

    @Override
    public void m1() {
        Right.super.m1();
    }
}

interface Left{
    default void m1(){
        System.out.println("Hello left!!");
    }
}

interface Right{
    default void m1(){
        System.out.println("Hello right!!");
    }
}
