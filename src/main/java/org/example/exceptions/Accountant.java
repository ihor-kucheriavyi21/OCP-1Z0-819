package org.example.exceptions;

public class Accountant {
    public void doTaxes() throws Throwable { try {
        throw new NumberFormatException();
    } catch (ClassCastException
             | ArithmeticException f) { // p1
         System.out.println("Math");
    } catch (Exception f) { // p2  CAN'T be IllegalArgumentException | Exception f because first extends from EXCEPTION class
         System.out.println("Unknown");
    } }
    public static void main(String[] numbers) throws Throwable { try {
        new Accountant().doTaxes(); } finally {
        System.out.println("Done!"); }
    }
}
