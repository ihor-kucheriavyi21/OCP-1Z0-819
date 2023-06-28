package org.example.interfaces;

interface Sing {
    default int talk() {
        return 5;
    }
}

public class MultipleInheritance implements Speak, Sing {
    static {
        System.out.println("static"); }
    @Override
    public int talk() {
        return 2;
    }

    public int talk(String... x) {
        return x.length;
    }

    public static void main(String[] notes) {
        System.out.print(new MultipleInheritance().talk());
    }
}
