package com.imm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Maps {

    // a green apple
    //a=2  e=2
    //g=1  r=1
    //due to hashfunction map store these values in differern places


    //Famous Interview Question
    public static Character findFirstNonRepetedCharacter(String str){
        Map<Character,Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();
        for(Character ch: chars){
            //Terinery operator if chracter contains value increment by one
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count +1);
        }

        //due to hashfunction map store these values in different places in memory( not sequentially)
        //now match the character in String from first to end corresponding to Map values
        for(Character ch: chars){
            //first non repeated value       a green apple in string | in { =2, p=2, a=2, r=1, e=3, g=1, l=1, n=1}
            if(map.get(ch)==1) return ch;  //  ^
        }

        return Character.MIN_VALUE; // a default value when cant find any 1st repeated
    }

    //Famous Interview Question
    //Remove Duplication in a List
    public static Set removeDuplicates(int[]array){
        //sets are not allows Duplicates
        //copy array elements to Set
        Set<Integer> set = new HashSet<>();
        for(int item:array){
            set.add(item);
        }
        return set;
    }

    //Famous Interview Question
    //Find First Repeated Value

    public static char findFirstDuplicates(String str){
        //a green apple
        //     ^ now set contains 'e'
        Set<Character> set = new HashSet<>();

        for(Character ch:str.toCharArray()){
            if(set.contains(ch)) return ch;

            set.add(ch);
        }
        return Character.MIN_VALUE;

    }




}
