package org.example.constructor;

import java.util.LinkedList;

public class Ghost {
    private final String name;

    private static int end;

    public Ghost() {
        this(null);
        end = 2;
//        this.name = "Casper"; compilation error
    }

    public Ghost(String n) {
        name = "Boo";
    }

    public void checkStaticVariableInNonStaticMethod() {
        main(new String[]{});
        end = 2;
    }

    public static void main(String[] sound) {
        var d = new Ghost("Space");
        System.out.println(d.name);
        Boolean b = null;
        var x = new LinkedList<>();
        x.offer(18);
        System.out.println(x);
        var z = 3;
        switch (z) {
            case 3:
                System.out.println();
        }
    }
}