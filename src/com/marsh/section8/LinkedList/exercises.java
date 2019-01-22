package com.marsh.section8.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class exercises {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<String>();

        myLinkedList.add("This");
        myLinkedList.add("shit");
        myLinkedList.add("ain't");
        myLinkedList.add("worth");
        myLinkedList.add("it.");

        printList(myLinkedList);

    }

    public static void printList(LinkedList<String> myLinkedList){
        Iterator<String> i = myLinkedList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void printListReverse(LinkedList<String> myLinkedList){

    }
}
