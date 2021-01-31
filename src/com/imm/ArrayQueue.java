package com.imm;

import java.util.Arrays;

public class ArrayQueue {
    //[1,2,3,4,5,6,7]
    //f=0           r=6

    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity){
        items= new int[capacity];
    }

    public void enqueue(int item){
        if(isFull()) throw new IllegalStateException();
        items[rear++] = item;
        count++;
    }
    public int dequeue(){
        var item = items[front]; //get the value b4 make it as 0
        //1st assign 2nd increment
        items[front++]=0; //make the previous fron as 0
        return item;
    }


    private boolean isFull(){
        return count == items.length;
    }
    private boolean isEmpty(){
        return count ==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
