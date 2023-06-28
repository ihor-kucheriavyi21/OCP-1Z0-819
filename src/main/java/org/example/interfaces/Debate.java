package org.example.interfaces;

interface Speak {
    public default int getVolume() {
        return 20;
    }
}

interface Whisper {
    public default int getVolume() {
        return 10;
    }
}

public class Debate implements Speak, Whisper {
    public int getVolume() {
        return 30;
    }


    private static void drive() { System.out.println("fast");
    }
    { System.out.println("faster"); }
    public static void main(String[] args) {
        new MultipleInheritance();
    }
}
