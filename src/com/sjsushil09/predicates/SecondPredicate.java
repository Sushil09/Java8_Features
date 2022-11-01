package com.sjsushil09.predicates;

import java.util.function.Predicate;

public class SecondPredicate {
    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajal", "Malika", "Katrina", "Kareena"};
        //names starting with K
        Predicate<String> namesStartWithK = S->S.startsWith("K");
        m1(namesStartWithK,names);
    }
    public static void m1 (Predicate<String> predicate, String[]s){
        for (String x:s)
            System.out.println(predicate.test(x));
    }
}
