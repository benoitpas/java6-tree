package org.benoit;

//  jdk6 with OO approach
public abstract class Tree<T> {

    Tree<Pair<Integer,T>> addId() {
        return addId(0).v2;
    }
    protected abstract Pair<Integer,Tree<Pair<Integer, T>>> addId(Integer start);
}
