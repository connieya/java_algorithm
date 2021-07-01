package com.company.baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 요세푸스문제_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<= N; i++){
            queue.add(i);
        }

        System.out.print("<");
        while (queue.size()!=1){
            for (int j=1; j<K; j++){
                queue.add(queue.poll());
            }
            System.out.print(queue.poll()+", ");
        }
        System.out.print(queue.poll()+">");
    }
}
