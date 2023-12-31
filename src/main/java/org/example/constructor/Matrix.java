package org.example.constructor;

public class Matrix {
    private int level = 1;

    class Deep {
        private int level = 2;

        class Deeper {
            private int level = 5;

            public void printReality(int level) {
                System.out.print(this.level + " ");
                System.out.print(Matrix.Deep.this.level + " ");
                System.out.print(Deep.this.level);
            }
        }
    }

    public static void main(String[] bots) {
        Matrix.Deep.Deeper simulation = new Matrix().new Deep().new Deeper();
        simulation.printReality(6);
    }
}
