package com.sjsushil09.supplier;

import java.util.function.Supplier;

public class RandomNameGenerator {
    public static void main(String[] args) {
        Supplier<String> supplier = ()->{
            String[] names={"David","Fernando","Marcos","Xavi"};
            int rand = (int) (Math.random()*4);
            System.out.println(rand);
            return names[rand];
        };
        System.out.println(supplier.get());
    }
}
