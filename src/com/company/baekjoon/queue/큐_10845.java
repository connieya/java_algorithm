package com.company.baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 큐_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] queue = new int[n];
        int begin = 0;
        int end = 0;
        while (n-- >0){
            String cmd = br.readLine();
            if (cmd.startsWith("push")){
                String[] s = cmd.split(" ");
                int num = Integer.parseInt(s[1]);
                queue[end++] = num;
            }else if (cmd.equals("front")){
                if (begin == end){
                    System.out.println("-1");
                }else {
                    System.out.println(queue[begin]);
                }
            }else if (cmd.equals("size")){
                System.out.println(end-begin);
            }else if (cmd.equals("empty")){
                if (begin==end){
                    System.out.println("1");
                }else {
                    System.out.println("0");
                }
            }else if (cmd.equals("pop")){
                if (begin==end){
                    System.out.println("-1");
                }else {
                    System.out.println(queue[begin]);
                    begin+=1;
                }
            }else if (cmd.equals("back")){
                if (begin == end){
                    System.out.println("-1");
                }else {
                    System.out.println(queue[end-1]);
                }
            }
        }

    }
}
