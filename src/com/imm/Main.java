package com.imm;

import java.util.*;

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
//        ArrayQueue queue = new ArrayQueue(3);
//        queue.enqueue(1);
//        queue.enqueue(2);
//
//        queue.enqueue(4);
//
//        System.out.println(queue);

        //Queues Using Tow Stacks
//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//
//        queue.enqueue(1);
//        queue.enqueue(2);
//        //System.out.println(queue.dequeue());
//        //System.out.println(queue.dequeue());
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        System.out.println(queue.dequeue());

        //Priority Queue
//        PiorityQueue queue = new PiorityQueue();
//        queue.add(3);
//        queue.add(5);
//        queue.add(1);
//        queue.add(4);
//        //queue.add(7);
//        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        //Maps
//        System.out.println(Maps.findFirstNonRepetedCharacter("a green apple"));
//        int arr[] = {1,1,2,3,4,4,4,5,6,7};
//        System.out.println(Maps.removeDuplicates(arr).toString());
//        System.out.println(Maps.findFirstDuplicates("a green apple"));

        //Simple Hash Functions
//        Map<Integer,String> mapIntKey = new HashMap<>();
//        mapIntKey.put(10023121,"qwwere");
//        Map<String,Integer> mapStrKey = new HashMap<>();
//        mapStrKey.put("sasdg-12233",10);
//        //Hashed location in 100 element of Array for String and Integer Keys
//        System.out.println(HashFucntion.hashString("sasdg-12233"));
//        System.out.println(HashFucntion.hashInt(10023121));

        //HashTables
        HashTable table = new HashTable();
        table.put(6,"A");//store at 1
        table.put(8,"A");//store at 3
        table.put(11,"C");// store at 1 should store at the last
        //-in Linked List at index 1
        table.put(6,"A+"); //add Duplicate Value
        System.out.println("Done");
   }
}
