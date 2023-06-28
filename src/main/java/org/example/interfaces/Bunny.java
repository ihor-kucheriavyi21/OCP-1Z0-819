package org.example.interfaces;

public class Bunny {
    static interface Rabbit {
        default void printer(){

        }
    }

    static class FlemishRabbit implements Rabbit {
    }

    private static void hop(Rabbit r) {
        System.out.print("hop");
    }

    private static void hop(FlemishRabbit r) {
        System.out.print("HOP");
    }

    public static void main(String[] args) {
        Rabbit r1 = new FlemishRabbit();
        FlemishRabbit r2 = new FlemishRabbit();
        hop(r1);
        hop(r2);
    }
}
