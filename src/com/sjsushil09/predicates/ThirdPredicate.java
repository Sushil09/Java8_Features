package com.sjsushil09.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ThirdPredicate {
    public static void main(String[] args) {
        String[] names = {"durga", "", null, "Ravi", "", "Shiva", null};
        List<String> list =new ArrayList<>();
        Predicate<String> checkEmptyOrNull = S->!(S==null || S.isEmpty());
        for(String x: names){
            if(checkEmptyOrNull.test(x))
                list.add(x);
        }
        for (String x: list)
            System.out.println(x);
    }
}
