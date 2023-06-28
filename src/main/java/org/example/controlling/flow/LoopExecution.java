package org.example.controlling.flow;

public class LoopExecution {
    public static void main(String[] args) {
        int k = 0;
        do {
            System.out.println(k);

        } while (k++ < 5);
        int l = 0;
        while (l++ < 5) {
            System.out.println(l);
        }
    }

    public void checkBraces() {
        int secret = 0;
        for (int i = 0; i < 10; i++)
            while (i < 10)
                if (i == 5)
                    System.out.println("if");
                else {
                    System.out.println("in");
                    System.out.println("else");
                }


        switch (secret) {
            case 0:
                System.out.println("zero");
        }
    }
}
