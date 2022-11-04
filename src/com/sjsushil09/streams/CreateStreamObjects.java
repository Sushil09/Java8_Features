package com.sjsushil09.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(7);

        List<Integer> evenList = new ArrayList<>();
        evenList = arrayList.stream().filter((a)->a%2==0).collect(Collectors.toList());

        List<Integer> doubleList = arrayList.stream().map((a)->2*a).collect(Collectors.toList());

        System.out.println(doubleList);

    }
}
