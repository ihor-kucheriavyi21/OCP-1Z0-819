package org.example.lambda;

import java.util.Comparator;

public class ComparatorExample {

    public void comparatorString() {
        Comparator<String> c1 = (j, k) -> 0;
        Comparator<String> c2 = (String j, String k) -> 0;
       /* Comparator<String> c3 = (var j, String k) -> 0; don't compile
        Comparator<String> c4 = (var j, k) -> 0;*/
        Comparator<String> c5 = (var j, var k) -> 0;
    }

}
