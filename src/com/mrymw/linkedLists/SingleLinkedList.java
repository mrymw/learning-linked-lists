package com.mrymw.linkedLists;

import java.util.StringJoiner;

public class SingleLinkedList {
    private Node head;
    private int size;

    public SingleLinkedList() {
        this.head = null;
        this.size =0;
    }
    public SingleLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
    }
    public void checkBounds(int position, int low, int high) {
        if(position > high || position < low) {
            throw new IndexOutOfBoundsException(position+"");
        }
    }

    public void insertWith(int data, int position) {
        checkBounds(position, 0, size);
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node curNode = head;
            for (int i = 0; i < position - 1; ++i) {
                curNode = curNode.next;
            }
            newNode.next = curNode.next;
            curNode.next = newNode;
        }
        size++;
    }
    public void insertHead(int x) {insertWith(x, 0);}
    public void insert(int x) {insertWith(x, size);}
    public void deleteWith(int position) {
        checkBounds(position, 0, size-1);
        if(position == 0) {
            head = head.next;
            size--;
            return;
        }
        Node curNode = head;
        for(int i=0; i<position; ++i){
            curNode=curNode.next;
        }
        curNode.next = curNode.next.next;
        size--;
    }
    public void deleteHead() {deleteWith(0);}
    public void delete() {deleteWith(size-1);}

    @Override
    public  String toString() {
        StringJoiner joiner = new StringJoiner("->");
        Node curNode = head;
        while (curNode != null){
            joiner.add(curNode.value+"");
            curNode = curNode.next;
        }
        return joiner.toString();
    }
    public boolean valueExists(int x) {
        Node curNode = head;
        while (curNode != null) {
            if (curNode.value == x) {
                return true;
            }
            curNode = curNode.next;
        }
        return false;
    }
    public int valueExistsAtIndex(int index) {
        Node curNode = head;
        for (int i = 0; i < index; i++) {
            curNode= curNode.next;
        }
        return curNode.value;
    }
}
