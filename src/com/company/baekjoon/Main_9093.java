package com.company.baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Main_9093 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

            String exam = sc.nextLine();
            exam+= " ";
            String answer = "";
            Stack stack = new Stack();
            while (exam.indexOf(" ") != -1) {


                int k = exam.indexOf(" ");
                String sub = exam.substring(0, k);
                for (char x : sub.toCharArray()) {
                    stack.push(x);
                }
                for (int z = 0; z < sub.length(); z++) {
                    answer += stack.pop();
                }
                answer += " ";
                exam = exam.substring(k + 1);

            }
            System.out.println(answer);



    }
}
