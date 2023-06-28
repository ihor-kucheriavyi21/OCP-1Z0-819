package org.example.interfaces;

interface MusicCreator {
    public Number play();
}

abstract class StringInstrument {
    public Long play() {
        return 3L;
    }
}

interface Dog {
    private void buryBone() {
        System.out.println("lala");
        ;
    }

    private static void wagTail() {
        //chaseTail(); doesn't compile
    }

    public default String chaseTail() {
        return "So cute!";
    }
}

public class Violin extends StringInstrument implements MusicCreator {
    public String chaseTail() throws IllegalArgumentException {
        throw new IllegalArgumentException("Too little!");
    }

    public static void main(String[] t) {
        var p = new Violin();
        System.out.print(p.chaseTail());
    }

    public Long play() {
        return null;
    }
}
