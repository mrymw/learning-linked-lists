package com.mrymw.linkedLists;

public class DoubleLinkedList {
    DoublyNode head;
    DoublyNode tail;
    int size;
    public void insert(int value, int index) {
        DoublyNode newNode = new DoublyNode(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            size = 1;
            return;
        }
        if(index == 0) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if(index <= size) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            DoublyNode curNode = head;
            int i = 0;
            while (i<index-1) {
                curNode = curNode.next;
                i++;
            }
            newNode.prev = curNode;
            newNode.next = curNode.next;
            curNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }
}
