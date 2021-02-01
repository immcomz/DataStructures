package com.imm;

public class HashFucntion {

    public static  int hashString(String Stringkey){
        //hash code to String Key
        int hash=0;
        for(Character ch: Stringkey.toCharArray())
            hash += ch; //implicit casting/ convert ch to its numeric representation
        return hash % 100; //location to save 100 index of an array
    }

    public static int hashInt(int Intkey){
        //Hash Code for Integer Key
        return Intkey % 100;
    }
}
