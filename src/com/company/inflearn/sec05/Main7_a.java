package com.company.inflearn.sec05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7_a {


    public String  solution(String n, String k) {

        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char c : n.toCharArray()){
            queue.offer(c);
        }

        for (char x : k.toCharArray()){
            if (queue.contains(x)){
                if (x!= queue.poll()) return "NO";

            }
        }
        if (!queue.isEmpty()) return "NO";



        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        String k = sc.next();

        Main7_a T = new Main7_a();
        System.out.println(T.solution(n,k));
    }
}
