package com.sjsushil09.methodreferences;

public class ThreadsExample {
    public static void main(String[] args) {

        ThreadsExample threadsExample = new ThreadsExample();
        Runnable runnable = threadsExample::m1;

        Thread thread = new Thread(runnable);
        thread.start();

        for(int i=0;i<10;i++)
            System.out.println("Main Thread");
    }

    public void m1(){
        for(int i=0;i<10;i++)
            System.out.println("Child Thread");
    }
}
