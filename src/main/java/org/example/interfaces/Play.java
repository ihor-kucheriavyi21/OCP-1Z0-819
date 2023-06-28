package org.example.interfaces;

@FunctionalInterface
public interface Play {
    public static void baseball() {
        System.out.println("lala");
    }

    private static void soccer() {
    }

    default void play() {
    }

    void fun();
}