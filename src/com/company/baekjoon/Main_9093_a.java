package com.company.baekjoon;
import java.util.*;
import java.io.*;
public class Main_9093_a {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (t-- > 0) {
            String str = bf.readLine() + "\n";
            Stack<Character> s = new Stack<>();
            for (char ch : str.toCharArray()) {
                if (ch == '\n' || ch == ' ') {
                    while (!s.isEmpty()) {
                        bw.write(s.pop());
                    }
                    bw.write(ch);
                } else {
                    s.push(ch);
                }
            }
        }
        bw.flush();
    }
}
