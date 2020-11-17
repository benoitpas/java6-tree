package org.benoit;

public class Node<T> extends Tree<T> {
    private final T value;
    private final Tree left;
    private final Tree right;

    public T getValue() {
        return value;
    }

    public Node(T value, Tree left, Tree right) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    void addTo(StringBuilder sb, Object v) {
        String s = v.toString();
        if (s != "") {
            sb.append(",");
            sb.append(s);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(value.toString());
        addTo(sb, left);
        addTo(sb, right);
        sb.append(")");
        return sb.toString();
    }

    protected Pair<Integer, Tree<Pair<Integer, T>>> addId(Integer start) {
        Pair<Integer, Tree<Pair<Integer, T>>> newLeft = left.addId(start);
        Pair<Integer, Tree<Pair<Integer, T>>> newRight = right.addId(newLeft.v1);

        return new Pair(newRight.v1 + 1,
                new Node(new Pair(newRight.v1, this.getValue()), newLeft.v2,newRight.v2));
    }
}
