package org.example.controlling.flow;

public class LoopLabel {

    public static void main(String[] args) {

        var race = "";

        var b = 1;
        loop:
        do {

            race += "x";
            if (b == 1) {
                break loop;
            }
            testLoop:
            b = 3;
            var c = 4;
        } while (true);
        System.out.println(race);

    }

    public void infinityLoop() {
        for (; ; ) {
        }
    }
}
