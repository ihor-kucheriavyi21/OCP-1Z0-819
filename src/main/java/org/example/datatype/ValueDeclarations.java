package org.example.datatype;

public class ValueDeclarations {
    double num1 = 2.718;
    //    double num2 = 2._718;
    double num3 = 2.7_1_8;

    //    double num4 = _2.718;
    public static void main(String[] args) {
        var builder = "54321";
        builder = builder.substring(4);
        System.out.println(builder);
    }
}
