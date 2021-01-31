package com.imm;

import java.util.Arrays;

public class ArrayQueue {
    //[1,2,3,4,5,6,7]
    //f=0           r=6

    //Circular Arrays ex: after deq 2 elements from [1,2,3,4,5]
    //[0,0,3,4,5] cant add any items more cause array is full with 2 spaces [0,0,...
    //index 5 -> index 0  Left/length = 0 or left(rear+1) % length = remender
    //index 6 -> index 1  | 6/5 = 1
    //index 7 -> index 2  | 7/5 = 1
    //index 8 -> index 3  | 8/5 = 1
    //index 9 -> index 4  | 9/5 = 1



    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity){
        items= new int[capacity];
    }

    public void enqueue(int item){
        if(isFull()) throw new IllegalStateException();
        items[rear] = item;
        rear = (rear+1)% items.length;
        count++;
    }
    public int dequeue(){
        if(isEmpty()) throw new IllegalStateException();
        var item = items[front]; //get the value b4 make it as 0
        //1st assign 2nd increment
        items[front]=0; //make the previous fron as 0
        front = (front+1) % items.length; // inorder to make the array circular
        count--;
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
