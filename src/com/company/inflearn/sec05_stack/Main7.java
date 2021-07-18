package com.company.inflearn.sec05_stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7 {


    public String  solution(String n, String k) {

        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char c : n.toCharArray()){
            queue.offer(c);
        }

        Queue<Character> queue1 = new LinkedList<>();
        for (char q : k.toCharArray()){
            queue1.offer(q);
        }

        for (char x : k.toCharArray()){
            if (queue.contains(x)) queue1.offer(queue1.poll());
            else {
               queue1.poll();
            }
        }
        if (!queue.equals(queue1)) return "NO";



        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String k = sc.next();

        Main7 T = new Main7();
        System.out.println(T.solution(n,k));
    }
}
