package com.mrymw.linkedLists;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList linkedList = new SingleLinkedList();
        linkedList.insert(5);
        linkedList.insertHead(10);
        linkedList.insertWith(3, 1);
        System.out.println(linkedList);
    }
}
