package org.example.datatype;

enum Season {SPRING, SUMMER, WINTER}

public class Weather {
    public int getAverageTemperate(Season s) {
        switch (s) {
            default:
            case SPRING: return 30;
        }
    }
}
