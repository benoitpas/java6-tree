package org.benoit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TreeTest {
    @Test
    public void addIdTest() {
        Node expected = new Node(new Pair(4, "a"),
                new Node(new Pair(0, "b"), App.l, App.l),
                new Node(new Pair(3, "c"),
                        new Node(new Pair(1, "d"), App.l, App.l),
                        new Node(new Pair(2, "e"), App.l, App.l)));
        assertEquals(expected, App.na.addId());
    }

}
