package com.mrymw.exercises;

import java.util.LinkedList;

public class RearrangingEvenOdd {
    public static void rearrange(LinkedList<Integer> list) {
        if(list.isEmpty()) {
            System.out.println("list is EMPTY!!");
        }
        LinkedList<Integer> tempList = new LinkedList<>();
        for (int e: list) {
            if(e%2 ==0) {
                tempList.addFirst(e);
            } else {
                tempList.addLast(e);
            }
        }
        System.out.println(tempList);
    }
}
