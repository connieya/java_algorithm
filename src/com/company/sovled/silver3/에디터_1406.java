package com.company.sovled.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class 에디터_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Deque<Character> deque1 = new ArrayDeque<>();
        Deque<Character> deque2 = new ArrayDeque<>();
        for (int i=0; i<str.length(); i++){
            deque1.add(str.charAt(i));
        }
        int t = Integer.parseInt(br.readLine());
        while (t-- >0){
            String cmd = br.readLine();
            if (cmd.charAt(0) == 'L'){
                if (!deque1.isEmpty()){
                    deque2.addLast(deque1.pollLast());
                }
            }else if (cmd.charAt(0) == 'B'){
                if (!deque1.isEmpty()){
                    deque1.pollLast();
                }
            }else if (cmd.charAt(0)=='D'){
                if (!deque2.isEmpty()) {
                    deque1.addLast(deque2.pollLast());
                }
            }else{
                deque1.addLast(cmd.charAt(2));
            }
        }
        while (!deque2.isEmpty()){
            deque1.add(deque2.pollLast());
        }
        StringBuilder sb = new StringBuilder();
        while (!deque1.isEmpty()){
            sb.append(deque1.pollFirst());
        }
        System.out.println(sb);
    }
}
