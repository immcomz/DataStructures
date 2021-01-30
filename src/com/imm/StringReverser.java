package com.imm;

import java.util.Stack;

public class StringReverser {

    public static String reverseString(String input){
        if(input==null) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()) // convert String to character Arrsy
            stack.push(ch); //add characters to String
        // use StringBuffer instead of making immutable String objects as below
        //reversded += tack.pop() save memory
        StringBuffer reversed = new StringBuffer();
        while(!stack.empty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
