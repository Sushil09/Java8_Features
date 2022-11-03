package com.sjsushil09.bipredicate;

import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> sums = (a,b)-> (a+b)%2==0;

        System.out.println(sums.test(2,3));
    }
}
