package com.bootcamp.behaviorpattern.iterator_behavior;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Karl", "Jones", "Sergio");

        Iterator<String> iteratorNames = names.iterator();

        while (iteratorNames.hasNext()) {
            System.out.println(iteratorNames.next());
        }
    }
}
