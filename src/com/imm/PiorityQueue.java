package com.imm;

import java.util.Arrays;

public class PiorityQueue {
    //priority Queue
    //insert(2)
    //[1,3,4,7]
    // 0 1 2 3 4
    //[1,3,4,7,7] mover 7 to index+1 or Array[i+1]=Array[i]
    //........
    //[1,2,3,4,7]
    private int [] items = new int[5];
    private int count;

    public void add(int item){

        if(isFull()) throw new IllegalStateException();

        int i = shiftsItemsToInsert(item);
        items[i]=item;
        count++;
    }

    private int shiftsItemsToInsert(int item) {
        int i;
        for(i= count-1; i >= 0; i--){
            if(items[i]> item)
                items[i+1] =items[i]; // copy the item at index of i+1(by +1 possition)
            else
                break;//end of shifting and find the paste to add new element
        }
        return i+1;
    }

    public int remove(){
        if(isEmpty()) throw new IllegalStateException();
        //count now at the index of highest value cause priority Queue
        return items[--count];

    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
