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

//        linkedList.addLast(10);
//        linkedList.addLast(20);
//        linkedList.addLast(30);
//        linkedList.addLast(40);
//        linkedList.addLast(50);
        //linkedList.addFirst(0);
        //linkedList.removeLast();
        //linkedList.removeFirst();
        //System.out.println(linkedList.size());
        // LinkedList convert to array
        //System.out.println(Arrays.toString(linkedList.toArray()));

        //linkedList.reverse();
        //System.out.println(linkedList.kthNodeFromEnd(4));
        //linkedList.addLast(4);

        // LinkedList Contains
        //System.out.println(linkedList.contains(1));

        //String Riverser
        //System.out.println(StringReverser.reverseString("abcdefg"));
        //Balanced String
        //System.out.println(BalancedExpression.isBalanced("(<1+2<)"));

        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(1);
        stack.pop();
       // stack.pop();
        System.out.println(stack);

        java.util.Stack stackJv = new java.util.Stack();
            stackJv.push(1);
            stackJv.push("1asasaa");
            stackJv.pop();
        System.out.println(stackJv);

    }
}
