package com.imm;

//Creating Array Class to implement Array Functionalities
public class Array {
    private int [] items;

    public Array(int length){
        items = new int[length];
    }

    public void print(){
        for(int i=0; i< items.length; i++)
            System.out.println(items[i]);

    }
}
