package com.sjsushil09.consumer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {

    String name;
    int marks;
}

class Driver{
    public static void main(String[] args) {
        Predicate<Student> predicate = s->s.marks>=60;
        Function<Student,String> function = s->{
            if(predicate.test(s))
                return "A";
            return "none";
        };
        Consumer<Student> consumer = s->{
            System.out.println(s.marks);
            System.out.println(s.name);
        };
    }
}
