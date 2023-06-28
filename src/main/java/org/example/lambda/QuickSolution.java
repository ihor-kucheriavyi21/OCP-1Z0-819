package org.example.lambda;

import java.util.List;
import java.util.stream.Stream;

public class QuickSolution {
    public static int findFast(Stream<Integer> s) { return s.findAny().get();
    }
    public static int findSlow(Stream<Integer> s) {
        return s.parallel().findFirst().get(); }
    public static void main(String[] pencil) { var s1 = List.of(1,2,3,4,5).stream(); var s2 = List.of(1,2,3,4,5).stream(); int val1 = findFast(s1);
        int val2 = findSlow(s2);
        System.out.print(val1+" "+val2); }
}
