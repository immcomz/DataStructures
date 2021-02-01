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

    private final LinkedList<Entry>[] entries = new LinkedList[5];

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
        for(var entry :entries[index]){
            //whatisThisLoopEntry (var entry :entries[index]) above
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

    private int hash(int key){
        return key % entries.length;
    }



}
