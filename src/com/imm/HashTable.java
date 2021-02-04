package com.imm;

import java.util.ArrayList;
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
    //private  ArrayList<LinkedList<Entry>> entries = new ArrayList<>();
    //use ArrayList for Dynamic List
    private  LinkedList<Entry>[] entries = new LinkedList[5];// [bucket<Entry>,bucket<Entry>,bucket]

    public void put(int key, String value ){
        var entry = getEntry(key);
        if(entry != null){
            entry.value = value;
            return;
        }

        //else/  any Node exist(not duplicates) in given index of LinkedList array add the Node
        //-end of this Linked List [_]-Exist Node->[_]- new Node(key Value) at End
        var bucket = getOrCreateNewEntry(key);
        bucket.addLast(new Entry(key,value));
    }

    public String get(int key){
        var entry = getEntry(key);

        return (entry==null) ? null: entry.value;

    }

    public void remove(int key){
        var entry = getEntry(key);
        if(entry == null)
            throw new IllegalStateException();

        var bucket = getBucket(key);
        bucket.remove(entry);

    }

    private int hash(int key){
        return key % entries.length;
    }

    private Entry getEntry(int key){

        var bucket = getBucket(key);
        //linkedList/bucket is null
        if(bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key)
                    return entry; //get the entry(k,v)
            }
        }
        //if bucket null
        return null;
    }

    private LinkedList<Entry> getBucket(int key){
        //hash the key
        var index = hash(key);
        //linkedList at given array Index
        var bucket = entries[index];

        return bucket;
    }

    private LinkedList<Entry>getOrCreateNewEntry(int key){
        var index = hash(key);
        var bucket = entries[index];
        //create new LinkedList to add entry
        if(bucket == null)
            // add new Node at index in the LL array of Linkedlist entries
            entries[index] = new LinkedList<>();
        //or get the bucket
        return bucket;
    }


}
