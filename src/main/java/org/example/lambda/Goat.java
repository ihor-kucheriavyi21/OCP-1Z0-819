package org.example.lambda;

import java.util.List;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;

public class Goat {
    private String food;

    public Goat(String food) {
        this.food = food;
    }

    public static void secret(String mystery) {
        char ch = mystery.charAt(3);
//        mystery = mystery.insert(1, "more");
        int num = mystery.length();
    }

    public String getFood() {
        return food;
    }

    // constructor, getter and toString
    public static void main(String[] args) {
        var goats = List.of(
                new Goat("can"), new Goat("hay"), new Goat("shorts"), new Goat("hay"));
        goats.stream().collect(groupingBy(Goat::getFood)).entrySet()
                .stream()
                .filter(e -> e.getValue().size() == 2).map(e -> e.getKey()).collect(partitioningBy(e -> e.isEmpty())).get(false)
                .stream()
                .sorted()
                .forEach(System.out::print);
    }
}
