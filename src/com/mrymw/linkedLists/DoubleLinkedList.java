package com.mrymw.linkedLists;

import java.util.StringJoiner;

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
    public void delete(int index){
        if(index == 0){
            if(size == 1) {head = null;tail = null;}
            else {head = head.next;head.prev = null;}
        } else if (index >=size) {
            DoublyNode curNode = tail.prev;
            if(size == 1) {head = null;tail = null;}
            else {curNode.next = null;tail = curNode;}
        } else {
            DoublyNode curNode = head;
            for (int i =0; i < index-1; i++){
                curNode = curNode.next;
            }
            curNode.next = curNode.next.next;
            curNode.next.prev = curNode;
        }
        size--;
    }

    @Override
    public  String toString() {
        StringJoiner joiner = new StringJoiner("->");
        DoublyNode curNode = head;
        while (curNode != null){
            joiner.add(curNode.value+"");
            curNode = curNode.next;
        }
        return joiner.toString();
    }
    public void traverse() {
        DoublyNode curNode = head;
        while (curNode != null) {
            System.out.print(curNode.value + "->");
            curNode = curNode.next;
        }
        System.out.println();
    }
    public void reverseTraverse() {
        DoublyNode curNode = tail;
        while (curNode != null) {
            System.out.print(curNode.value + "->");
            curNode = curNode.prev;
        }
        System.out.println();
    }

}
