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
            if(isLeftCharacter(ch))
                stack.push(ch);

            if(isRightCharacter(ch)) {
                if (stack.empty()) return false;//ex )1+4( to Avoid first pop
                // get the top
                var top = stack.pop();
                // match the current character/symbol with top of the stack
                if(!isBracketMatch(top,ch)) return false;
            }
        }
        return stack.empty();
    }

    private static boolean isLeftCharacter(Character ch){
        return ch =='(' || ch == '<'|| ch == '[' || ch == '{';
    }

    private static boolean isRightCharacter(Character ch){
        return ch == ')'|| ch == '>'|| ch == ']' || ch == '}';
    }

    private static boolean isBracketMatch(char left,char right){
        //where left = current character at String
        //right = top character of the stack
    return ((right==')' && left =='(') ||
            (right=='>' && left =='<') ||
            (right==']' && left =='[') ||
            (right=='}' && left =='{'));
    }
}
