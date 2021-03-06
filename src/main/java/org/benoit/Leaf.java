package org.benoit;

/**
 * As the class is a singleton, no need to implement equals/hashcode as only once instance exists.
 * @param <T>
 */
public class Leaf<T> extends Tree<T> {
    private Leaf() {}

    private static Leaf l = new Leaf();

    public static Leaf get() {
        return l;
    }

    @Override
    public String toString() {
        return "";
    }

    protected Pair<Integer, Tree<Pair<Integer, T>>> addId(Integer start) {
        // using 'this' is wrong from a type point of view but because of Java
        // type erasure it works (only because there is no value of 'T' in the class) .
        return new Pair(start, this);
    }
}
