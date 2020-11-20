package org.benoit;

import java.util.Arrays;

// Abstracted 'Indexed' interface and added type safety
// slight disadvantage: we are using 'Integer' instead of 'int' so this solution uses
// more memory (1.3 available in 2000 while 1.6 in 2006, so more memory available ;-)
// https://en.wikipedia.org/wiki/Java_version_history )
public final class Pair<T1,T2> {
    final T1 v1;
    final T2 v2;

    public Pair(T1 v1, T2 v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    T1 getV1() {
        return this.v1;
    }

    T2 getV2() {
        return this.v2;
    }

    @Override
    public String toString() {
        return "[" + v1 + "," + v2 + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair<?,?> pair = (Pair<?,?>) obj;
        return Helper.equals(v1, pair.v1) && Helper.equals(v2, pair.v2);
    }

    @Override
    public int hashCode() {
        // Arrays.hashcode() added in 1.5
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Arrays.html#hashCode(boolean%5B%5D)
        return Arrays.hashCode(new Object[]{v1, v2});
    }
}
