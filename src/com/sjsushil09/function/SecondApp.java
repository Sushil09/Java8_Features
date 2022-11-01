package com.sjsushil09.function;

import java.util.function.Function;

public class SecondApp {
    public static void main(String[] args) {
        //remove all blank spaces from string
        String s="David is a good player   ";
        System.out.println("Before length:"+s.length());
        Function<String,Integer> function = S->S.replaceAll(" ","").length();
        System.out.println(function.apply(s));
    }
}
