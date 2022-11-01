package com.sjsushil09.lambdas;

public class Threads {
    public static void main(String[] args) {
        Runnable runnable = ()->{
            for(int i=0;i<10;i++)
                System.out.println("Child thread"+ Thread.currentThread().getName());
        };

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("Main thread"+Thread.currentThread().getName());
    }
}
