package com.imm;

//Creating Array Class to implement Array Functionalities
public class Array {
    private int [] items;
    private int count=0; //to dertimine # elements in an array

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

            //set 'items' to this new Array
            items = newItems;

        }
        //add the new element at the end
        items[count++]=item;
    }
    public void removeAt(int index){
        //[30,40,50,60] remove 2nd element
        //validate index
        if(index <0 || index >= count) // if index is out of range
            throw new IllegalArgumentException();

        //Shift the items to the left to fill the space/hole
        //[30,50,60,60] but still have extra one element 60
        for (int i=index; i<count; i++)
            items[i] = items[i + 1];

        //Shrink the Array
        count--; // Decrement the total number of elements not the size purpose of printing
    }

    public void print(){
        for(int i=0; i< count; i++)
            System.out.println(items[i]);

    }
}
