package org.example.learnenum;

enum Direction {north, south, east, west;
};

public class Ship {
    public static void main(String[] compass) {
        System.out.print(Direction.valueOf("north"));
        System.out.println(Direction.east.ordinal()+"");
    }
}

