package org.benoit;

/**
 * Add a unique id to each node
 *
 */
public class App 
{
    static final Leaf l = Leaf.get();
    static final Node nd = new Node("d", l, l);
    static final Node nb = new Node("b", l, l);
    static final Node ne = new Node("e", l, l);
    static final Node nc = new Node("c", nd, ne);
    static final Node na = new Node("a", nb, nc);

    public static void main( String[] args ) {
        System.out.println("Hello World!");

        System.out.println(na);
        System.out.println(na.addId());
        System.out.println(na.addId().addId());
    }
}
