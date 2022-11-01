package com.sjsushil09.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {

        //creating a stream
        Stream<String> stringStream = Stream.of("a","b","c");
//        stringStream.forEach(System.out::println);

        //creating stream from sources
        Collection<String> collection = Arrays.asList("Java","J2EE","Spring","Hibernate");
        Stream<String> stream = collection.stream();
        stream.forEach(System.out::println);


    }
}
