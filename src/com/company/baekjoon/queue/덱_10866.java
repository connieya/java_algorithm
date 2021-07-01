package com.company.baekjoon.queue;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class 덱_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        while (N--  >0){
            String cmd = br.readLine();
            if (cmd.startsWith("push_front")){
                int num = Integer.parseInt(cmd.split(" ")[1]);
                queue.offerFirst(num);
            }else if (cmd.startsWith("push_back")){
                int num = Integer.parseInt(cmd.split(" ")[1]);
                queue.offerLast(num);
            }else if (cmd.equals("front")){
                System.out.println(queue.isEmpty() ? -1 : queue.peekFirst());
            }else if (cmd.equals("back")){
                System.out.println(queue.isEmpty()?-1:queue.peekLast());
            }else if (cmd.equals("size")){
                System.out.println(queue.size());
            }else if (cmd.equals("pop_front")){
                System.out.println(queue.isEmpty()?-1:queue.pollFirst());
            }else if (cmd.equals("pop_back")){
                System.out.println(queue.isEmpty()?-1:queue.pollLast());
            }else if (cmd.equals("empty")){
                System.out.println(queue.isEmpty()?1:0);
            }
        }


    }
}
