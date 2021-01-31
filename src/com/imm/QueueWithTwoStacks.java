package com.imm;
import java.util.Stack;

public class QueueWithTwoStacks {

    private Stack<Integer> stack1 = new Stack<>(); //for enqueue operation
    private Stack<Integer> stack2 = new Stack<>(); //dequeue operations

    public void enqueue(int item){
        stack1.push(item);
    }
    public int dequeue(){

        if(isEmpty()) throw new IllegalStateException();
        //stack 2 is empty take the items from stack1 and
        // push to stack 1 for pop(or to make the order of queue)

        moveStack1ToStack2();

        return stack2.pop();
    }

    public int peek(){
        //same as dequeue
        if(isEmpty()) throw new IllegalStateException();

        moveStack1ToStack2();

        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
   }
}
