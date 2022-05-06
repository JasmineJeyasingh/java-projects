package com.lc101.jasmine.exercises.interfacedemo;

import com.lc101.jasmine.exercises.Pet;

public interface DefaultMethod {
    void someMethod();
    static final int i = 0;

    default int someOtherMethod() {
        // ...code goes here...
        return 0;
    }
    public static String demo() {

        return null;
    }
}
