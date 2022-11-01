package com.sjsushil09.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class First {
    public static void main(String[] args) {
        Supplier<Date> supplier = ()->new Date();
        System.out.println(supplier.get().getTime());
    }
}
