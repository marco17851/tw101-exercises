package com.thoughtworks.tw101.exercises.exercise9;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Marco on 2/14/2017.
 */
public class NodeTest {
    private Node root;

    @Before
    public void setUp() throws Exception {
        root = new Node("Cecil");
    }

    @Test
    public void shouldAddLeftNode() throws Exception {
        root.add("Bill");

        assertEquals("Bill", root.getLeft().getName());
    }

    @Test
    public void shouldAddRightNode() throws Exception {
        root = new Node("Cecil");
        root.add("Tess");

        assertEquals("Tess", root.getRight().getName());
    }

    @Test
    public void shouldGetNodeNamesInCorrectOrder() throws Exception {
        root = new Node("Cecil");
        root.add("Bill");
        root.add("Tess");
        root.add("Casey");

        List<String> correctOrder = new ArrayList<>();
        correctOrder.add("Bill");
        correctOrder.add("Casey");
        correctOrder.add("Cecil");
        correctOrder.add("Tess");

        List<String> names = root.names();
        assertEquals(names, correctOrder);
    }

}