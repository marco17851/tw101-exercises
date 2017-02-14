package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private String name;
    private Node left;
    private Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    /**
     * Adds a new node to the correct position in a binary using recursion
     * @param nameOfNewNode - name of the new node
     */
    public void add(String nameOfNewNode) {
        // Check if new node is less than or equal to current node
        // If so, traverse left
        if (nameOfNewNode.compareTo(this.name) <= 0){
            if (this.left == null){
                Node newNode = new Node(nameOfNewNode);
                this.left = newNode;
            } else {
                this.left.add(nameOfNewNode);
            }
        } else {
            if (this.right == null){
                Node newNode = new Node(nameOfNewNode);
                this.right = newNode;
            } else {
                this.right.add(nameOfNewNode);
            }
        }
    }

    public String getName(){
        return this.name;
    }

    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }

    /**
     * Obtains an inorder traversal of the binary tree
     * @return list of strings in alphabetical order
     */
    public List<String> names() {
        List<String> namesList = new ArrayList<String>();
        this.getInOrderTraversal(namesList);

        return namesList;
    }

    /**
     * Helper method to recursively get list of names
     * @param namesList - list that the names will be added to
     */
    private void getInOrderTraversal(List<String> namesList){
        if (this.left != null){
            this.left.getInOrderTraversal(namesList);
        }
        namesList.add(this.name);
        if (this.right != null){
            this.right.getInOrderTraversal(namesList);
        }
    }
}
