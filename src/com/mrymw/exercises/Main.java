package com.mrymw.exercises;

import java.util.LinkedList;

import static com.mrymw.exercises.RearrangingEvenOdd.rearrange;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        AddTwoNumbers.add(list, list2);
        rearrange(list);
    }
}
