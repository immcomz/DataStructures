package com.imm;

public class LinkedList  {

    //make Node class private/ only accible by LinkedList class
    private class Node {
        private int value;
        private Node next; //Store address to the next Node

        public Node(int value){
            this.value=value;
        }

    }

    private Node first;//head
    private Node last;//tail

    public void addLast(int item){
        var node = new Node(item);
        //if linkedlist empty assign to first Node
        if(isEmpty())
            first = last = node;
        //else append the node to last Node
        else {
            last.next = node;
            last = node;
        }
    }
    public void addFirst(int item){
        var node = new Node(item);

        //if the list is empty
        if(isEmpty())
           first = last =node; // addLast(item);

        //otherwise add to first
        else {
            node.next = first; //assign address of previous first node
            first = node; // make node as first node
        }
    }
    private Boolean isEmpty(){
        return first == null;
    }

}
