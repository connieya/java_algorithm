package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class N과M2_2 {
    static int n, m;
    static int[] answer;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        answer = new int[m];
        DFS(1, 0);
        System.out.println(sb);
    }

    static void DFS(int index, int selected) {
        if (selected == m) {
            for (int c : answer) {
                sb.append(c).append(" ");
            }
            sb.append("\n");
            return;
        }
        if (index > n) return;
        answer[selected] = index;
        DFS(index+1,selected+1);
        answer[selected] = 0;
        DFS(index+1,selected);
    }
}
