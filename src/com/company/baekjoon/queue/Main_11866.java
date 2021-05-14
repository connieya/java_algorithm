package com.company.baekjoon.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_11866 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i=1; i<=7; i++){
            queue.offer(i);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        while (queue.size()>1){
            for (int j=1; j<k; j++){
                queue.offer(queue.poll());
            }
            answer.add(queue.poll());
        }

        System.out.print("<");
        for (int c : answer){
            System.out.print(c+", ");
        }
        System.out.print(queue.poll()+">");

    }
}
