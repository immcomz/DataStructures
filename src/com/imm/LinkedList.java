package com.imm;

import java.util.NoSuchElementException;

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

    public void removeLast(){

        if(isEmpty()) throw new NoSuchElementException();

        //if list has only one node
        if(first == last){
            first = last =null;
            return;
        }
        var previous = getPreviousNode();
        //making previous as last Node
        last = previous;
        last.next=null;

    }
    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();

        // if list has only one Node
        if(first==last){
            first= last = null;
            return;
        }
        //Note:
        //Solution 1:
        // [10->20->30]  removing first [20->30], 10-> always link to 20
        // so Garbage collector doesn't colect it (10->)
        //Solution 2:
        // [10 20->30] canot remove the link/next from first to 20
        //cause it loose the track of second point
        //Solution 3:
        var second = first.next; //take a backup second node
        //now remove link/next from first (already have a backup)
        first.next=null;
        first=second; //assign brand new first to second
    }
    public boolean contains(int item){
        return indexOf(item)!=-1;
    }
    public int indexOf(int item){
        int index = 0;
        var current = first;

        while(current !=null){ //havent reach end of the list/ current.next =null
            if (current.value == item) return index;
            //otherwise assign current Node to current looping Node
            current = current.next;
            index++;
        }

        return -1;
    }
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
    private boolean isEmpty(){
        return first == null;
    }
    private Node getPreviousNode(){
        var current = first;
        while(current != null){
            //find the prevoius node and return
            if(current.next == last) return current;
            //travels through nodes
            current = current.next;
        }
        //if cpuldnt find the node
        return null;
    }
}
