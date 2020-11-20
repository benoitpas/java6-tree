package org.benoit;

public class Helper {
    // Objects included in java 7
    // https://docs.oracle.com/javase/7/docs/api/java/util/Objects.html
    // so we have to reimmplement equals here
    static boolean equals(Object a, Object b) {
        return a == b || a != null && a.equals(b);
    }
}
