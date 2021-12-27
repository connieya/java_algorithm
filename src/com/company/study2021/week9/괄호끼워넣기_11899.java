package com.company.study2021.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 괄호끼워넣기_11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Queue<Character> queue = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            queue.add(ch);
        }
        int num = 0;
        int answer = 0;
        while (!queue.isEmpty()) {
            char v = queue.poll();
            if (v == ')' && num == 0) {
                answer++;
            } else if (v == '(') {
                num++;
            }else {
                num--;
            }
        }
        System.out.println(answer+num);
    }
}
