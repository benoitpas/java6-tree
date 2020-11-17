package org.benoit;

/**
 * Add a unique id to each node
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        Leaf l = Leaf.get();
        Node nd = new Node("d", l, l);
        Node nb = new Node("b", nd, l);
        Node ne = new Node("e", l, l);
        Node nc = new Node("c", l, ne);
        Node na = new Node("a", nb, nc);

        System.out.println(na);
        System.out.println(na.addId());
        System.out.println(na.addId().addId());
    }
}
