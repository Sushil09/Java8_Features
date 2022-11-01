package com.sjsushil09.function;

import java.util.function.Function;

public class FirstFunction {
    public static void main(String[] args) {
        Function<String,Integer> function = S->S.length();
        System.out.println(function.apply("varun"));
    }
}
