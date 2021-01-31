package com.imm;

import java.util.Stack;

public class BalancedExpression {

    public static boolean isBalanced(String input){
        //((1+2)) test with an one symbl
        //({(<>)}) test with multiple symbols
        // When Balanced match the 1st pushed open '(' with closed ')'
        // in simple if found '(' ,push it and when find ')', pop it again = empty

        Stack<Character> stack = new Stack<>();

        for(char ch: input.toCharArray()){
            if(ch =='(' || ch == '<'|| ch == '[' || ch == '{')
                stack.push(ch);

            if(ch == ')'|| ch == '>'|| ch == ']' || ch == '}') {
                if (stack.empty()) return false;//ex )1+4( to Avoid first pop
                // get the top
                var top = stack.pop();
                // match the current character/symbol with top of the stack
                if((ch==')' && top !='(') ||
                   (ch=='>' && top !='<') ||
                   (ch==']' && top !='[') ||
                   (ch=='}' && top !='{') ) return false;



            }
        }
        return stack.empty();
    }
}
