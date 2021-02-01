package com.imm;

import java.util.LinkedList;

public class HashTable {
        //HashTable
        //put(key,value)
        //get(k)
        //remove(k)
        //k :int
        //v :String
        //collisions: chaining Strategy using LinkedLists
        //LinkedList<Entry>[LL,LL,LL] zll- LinkedList

    private class Entry{
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private  LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value ){
        //hash value of Key/place to store new entry
        var index = hash(key);
        //if node at index is empty
        if(entries[index]==null)
            // add Node at index in the LL array of Linkedlist entries
            entries[index]= new LinkedList<>();

        //Node/LinkedList entry at the index
        var bucket = entries[index];
        //Search For duplicates
        for(var entry :entries[index]){ //iterate over LinkedList at index in array
            //whatisThisLoopEntry = Linked List in Array
            var whatisThisLoopEntry =entries[index];
            //found assign the new value to exist entry
            if(entry.key==key) {
                entry.value = value;
                return;
            }
        }
        //else/  any Node exist(not duplicates) in given index of LinkedList array add the Node
        //-end of this Linked List [_]-Exist Node->[_]- new Node(key Value) at End
        bucket.addLast(new Entry(key,value));
    }

    public String get(int key){
        var index = hash(key);
        //linkedList at given array Index
        var bucket = entries[index];

        //linkedList is not null
        if(bucket != null) {
            for (var entry : bucket)
                if (entry.key == key)
                    return entry.value;
        }

        return null; // else lisnkedList null
    }

    private int hash(int key){
        return key % entries.length;
    }



}
