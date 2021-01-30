package com.imm;

import java.util.Stack;

public class BalancedExpression {

    public static boolean isBalanced(String input){
        // When Balanced match the 1st pushed open '(' with closed ')'
        // in simple if found '(' ,push it and when find ')', pop it again = empty

        Stack<Character> stack = new Stack<>();

        for(char ch: input.toCharArray()){
            if(ch =='(')
                stack.push(ch);

            if(ch == ')') {
                if (stack.empty()) return false;//ex )1+4( to Avoid first pop
                stack.pop();
            }
        }
        return stack.empty();
    }
}
