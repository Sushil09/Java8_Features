package com.sjsushil09.biconsumer;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b)-> System.out.println(a+b);
        biConsumer.accept("varun ","sharma");
    }
}
