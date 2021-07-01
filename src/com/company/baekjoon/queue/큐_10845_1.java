package com.company.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 큐_10845_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int num =0;
        while (n-- >0){
            String cmd = br.readLine();
            if (cmd.startsWith("push")){
                String[] s = cmd.split(" ");
                num = Integer.parseInt(s[1]);
                queue.add(num);
            }else if (cmd.equals("front")){
                System.out.println(queue.isEmpty()?-1:queue.peek());
            }else if (cmd.equals("size")){
                System.out.println(queue.size());
            }else if (cmd.equals("empty")){
                System.out.println(queue.isEmpty()?1:0);
            }else if (cmd.equals("pop")){
                System.out.println(queue.isEmpty()?-1: queue.poll());
            }else if (cmd.equals("back")){
                System.out.println(queue.isEmpty()?-1:num);
            }
        }

    }
}
