package com.imm;

public class Main {

    public static void main(String[] args) {
        //creating new Array
        Array numbers = new Array(3);
        numbers.insert(1);
        numbers.insert(2);
        numbers.insert(1);
        numbers.insert(2);
        numbers.print();
    }
}
