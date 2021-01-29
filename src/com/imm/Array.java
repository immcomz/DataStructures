package com.imm;

//Creating Array Class to implement Array Functionalities
public class Array {
    private int [] items;
    private int count=0;

    public Array(int length){
        items = new int[length];
    }

    public void insert(int item){
        //if the array is full, resize it
        if(items.length == count){
            //create a new Array (twice the size)
            int [] newItems = new int [count*2];

            //copy all the existing items to new Array
            for(int i=0; i< count; i++)
                newItems[i]=items[i];

            //ser 'items' to this new Array
            items = newItems;

        }
        //add the new element at the end
        items[count++]=item;
    }

    public void print(){
        for(int i=0; i< count; i++)
            System.out.println(items[i]);

    }
}
