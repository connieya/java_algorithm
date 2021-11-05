package com.company.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {
        int [] progresses = {93,30,55};
        int [] speeds = {1,30,5};
        double ceil = Math.ceil(2.3);
        Queue<Integer> queue  = new LinkedList<>();
        queue.add(10);
        queue.add(1);
        queue.add(1);
        System.out.println(queue.peek());
    }
}
