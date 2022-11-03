package com.sjsushil09.predicates;

import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        int[] a = {0, 5, 10, 15, 20, 25, 30};
        Predicate<Integer> p1= I->I>10;

        p1.test(5);
//        m1(p1,a);
        Predicate<Integer> p2= I->I%2==0;
        m1(p2,a);
//        m1(p1.negate(),a);
//        m1(p1.and(p2),a);
        m1(p1.or(p2),a);
    }

    public static void m1 (Predicate<Integer> p, int [] a){
        for(int x: a)
            System.out.println(p.test(x));
    }
}
