package com.imm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //creating new Array
//        Array numbers = new Array(3);
//        numbers.insert(1);
//        numbers.insert(2);
//        numbers.insert(3);
//        numbers.insert(4);
//        numbers.removeAt(1);
//        System.out.println(numbers.indexOf(1));
//        numbers.print();

        //creating new LinkedList
        var linkedList = new LinkedList();
        linkedList.addFirst(-1);
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addFirst(0);
        //linkedList.removeLast();
        //linkedList.removeFirst();
        //System.out.println(linkedList.size());
        System.out.println(Arrays.toString(linkedList.toArray()));
        linkedList.reverse();
        System.out.println(Arrays.toString(linkedList.toArray()));
        //linkedList.addLast(4);
        //System.out.println(linkedList.contains(1));
    }
}
