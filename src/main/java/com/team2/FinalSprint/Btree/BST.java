package com.team2.FinalSprint.Btree;


public class BST {

    public Node node;
    public BST(int value){
        node = new Node(value);
    }
    public Node insert(Node node, int value){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(node.left, value);
        }
        else if(value > node.value){
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void inOrder(Node node){
        if(node != null){
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

}