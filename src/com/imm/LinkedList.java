package com.imm;

import java.util.NoSuchElementException;

public class LinkedList  {
    //LinkedList doesnt perform indexes
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
    private int size; //length of list

    public int[] toArray(){

        int[] array = new int[size];
        var  current = first;
        int index = 0;

        while(current != null){
            array[index++] = current.value;
            current = current.next; //current refference to next Node
        }
        return array;
    }
    public void removeLast(){

        if(isEmpty()) throw new NoSuchElementException();

        //if list has only one node
        if(first == last){
            first = last =null;
            size--;
            return;
        }
        var previous = getPreviousNode();
        //making previous as last Node
        last = previous;
        last.next=null;

        size--;


    }
    public void removeFirst(){
        if(isEmpty()) throw new NoSuchElementException();

        // if list has only one Node
        if(first==last){
            first= last = null;
            size--;
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
        size--;
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
        //if linkedlist empty assign new node to first and last nodes
        if(isEmpty())
            first = last = node;
        //else append the node to last Node
        else {
            last.next = node;
            last = node;
        }
        size++;
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
        size++;
    }
    public void reverse(){
        //first    last
        //[10 ->20 ->30]
        // p    c    n
        //      p=c  c=n   n=0
        //           p=front c=0   n=0 stop iteration
        // n = c.next p=first c=p.next    last     first
        //c.next = p change the direction [10<-20<-30] or...
        //-current Node Refference(next) to preveious node/ reversed way c.next = p

        var previous = first; //
        var current = previous.next; // or first.next
        while(current != null){
            var next = current.next;
            //change the direction current.next=previous -> to <-/next of Node
            current.next=previous; // Nodes Refference to preveious node now
            previous=current;
            current=next;
        }

        last = first; //1st set last become first
        last.next = null; // last node doesnt have refference to any next Node
        first = previous; // cause as below
        //[10->20->30] p traverlse through and end at last which become first
        //          p    c   n //now first = previous where c=null/ Terminate the Loop
    }

    public int kthNodeFromEnd(int k){
        //Interview Question Findi the kth Node from the end in one pass
        //without looping entire list
        //ex:
        //[10 -> 20 -> 30 -> 40 -> 50]
        // *           *
        //move entire points until 2nd point reaches last node
        //- (while keeping the gap between 2 point As below)
        //[10 -> 20 -> 30 -> 40 -> 50]
        //             *           *

        // k = 1 [50]
        // ..
        // k = 3 [30] distance from 1st pointer to 2nd = 2 or (k-1)
        if(isEmpty()) throw new IllegalArgumentException() ;

        var a=first;
        var b= first;

        //now move b to (k-1) distance
        for(int i=0; i<k-1; i++){
            b=b.next;
        }
        //now move both 2 pointers until b reaches the Tail
        while(b!=last){
            a=a.next;
            b=b.next;
        }
         return a.value;
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

    //getter
    public int size(){
        return size;
    }
}
