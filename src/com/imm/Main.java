package com.imm;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

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
        //Stacks
        //Stack stack = new Stack(2);
//        stack.push(1);
//        stack.push(2);
//
//        stack.pop();
//        stack.push(3);
       // System.out.println(stack.peek());
       // System.out.println(stack);

        //Queues
                      //a Double ended Q can add elements from front or back
//        Queue q = new ArrayDeque();
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        QueueT.reverseQueue(q);
        //Queues Using Array
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        //queue.enqueue(3);
        queue.dequeue();
        System.out.println(queue.dequeue());

    }
}
