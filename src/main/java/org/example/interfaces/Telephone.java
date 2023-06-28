package org.example.interfaces;

public interface Telephone {
    static int call() { return 1; } default void dial() {}
    long answer();
    String home = "555-555-5555";
    
}
