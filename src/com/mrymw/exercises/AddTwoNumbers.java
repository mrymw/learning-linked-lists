package com.mrymw.exercises;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class AddTwoNumbers {
    public static void add(LinkedList<Integer> list, LinkedList<Integer> list2) {
        if(list.isEmpty() || list2.isEmpty()) {
            System.out.println("List is EMPTY!!");
            return;
        } if (list.size() != list2.size()) {
            System.out.println("Lists are not of the same size!!");
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < list.size(); i ++) {
            int sum = list.get(i) + list2.get(i);
            stack.push(sum);
        }
        System.out.println(stack);
    }
}
