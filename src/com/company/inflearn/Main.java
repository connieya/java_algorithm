package com.company.inflearn;

import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        int n = queue.poll();
        System.out.println(n);
    }

}
