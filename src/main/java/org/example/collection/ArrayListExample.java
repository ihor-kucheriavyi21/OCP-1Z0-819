package org.example.collection;

import java.util.Arrays;

public class ArrayListExample {
    public static void main(String... a) {
        var babies = Arrays.asList("chick", "cygnet", "duckling");
        babies.replaceAll(x -> {
            var newValue = "baby";
            return newValue;
        });
        System.out.println(babies);
        var nycTour = new String[] { "Downtown", "Uptown",
                "Brooklyn" };
        int length = nycTour.length;
    }
}
