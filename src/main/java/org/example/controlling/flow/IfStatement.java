package org.example.controlling.flow;

public class IfStatement {
    public final static void main(String... arguments) {
        boolean match = false;
        switch (3) {
            case 2:
                match = true;
        }
        int pterodactyl = 8;
        long triceratops = 3;
        if (pterodactyl % 3 > 1 + 1)
            triceratops++;
            triceratops--;
        System.out.print(triceratops);
    }
}
