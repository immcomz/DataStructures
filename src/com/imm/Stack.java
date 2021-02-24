package com.imm;

import java.util.Arrays;

public class Stack {
    //[10,20,30,40,50] where ^ - count
    //  ^

    private int[] items;
    private int count;

    public Stack(int length){
        items = new int[length];
    }

    public void push(int item){
        if(isFull()) throw new StackOverflowError();
        //get the element and increment count at end
        //count++ then items[count++] = item
        items[count++] = item;
    }

    public int pop(){
        if(isEmpty()) throw new IllegalStateException(); //state of object = 0
        //decrement count first and return item
        return items[--count];
    }

    public int peek(){
        if(isEmpty()) throw new IllegalStateException();
        return items[count-1];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count==items.length;
    }

    @Override
    public String toString() {
        //print only content of Array in Stack
        var content = Arrays.copyOfRange(items,0,count);
        return Arrays.toString(content);
    }
}
