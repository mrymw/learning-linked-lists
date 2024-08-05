package com.mrymw.linkedLists;

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
        if(head == null) {head = newNode; size++;}
        else if (position == 0) {newNode.next = head; head = newNode; size++;}
        Node curNode = head;
        for (int i = 0; i<position; ++i){
            curNode = curNode.next;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
        size++;
    }
    public void insertHead(int x) {insertWith(x, 0);}
    public void insert(int x) {insertWith(x, size);}

}
