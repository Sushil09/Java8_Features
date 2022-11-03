package com.sjsushil09.bifunction;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = (a,b)-> a+b;

        System.out.println(biFunction.apply(2,3));
     }
}
