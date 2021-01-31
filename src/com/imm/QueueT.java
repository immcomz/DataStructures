package com.imm;

import java.util.Queue;
import java.util.Stack;
//reversing an Queue using Stacks
public class QueueT {

    public static void reverseQueue(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();

        System.out.println("b4 stack"+stack);
        System.out.println("b4 queue"+queue);

        // loop over queue and remove elements to stack
        queue.stream().forEach(n->stack.push(queue.remove()));
        //until stack empty add pop elemens tro queue
        //stack.stream().forEach(n->queue.add(stack.pop()));// doesn't work
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        System.out.println("after stack"+stack);
        System.out.println("after queue"+queue);

    }
}
