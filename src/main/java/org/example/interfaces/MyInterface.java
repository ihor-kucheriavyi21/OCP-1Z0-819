package org.example.interfaces;

public interface MyInterface {

    void regularInterfaceMethod();

    default void defaultMethod() {
        // default method implementation
    }
}
