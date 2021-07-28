package com.company.code_plus.lecture02.brute_force;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class N과M9 {
    static int n, m;
    static int answer[];
    static int array[];
    static boolean check[];
    static LinkedHashSet<String> ans ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        array = new int[n];
        answer = new int[m];
        check = new boolean[n];
        ans= new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        DFS(0);
        ans.forEach(System.out::println);
    }

    static void DFS(int L) {
        if (L == m) {
            StringBuilder sb = new StringBuilder();
            for (int c : answer) {
                sb.append(c).append(" ");
            }
            ans.add(sb.toString());
            return;
        }

        for (int i = 0; i < n; i++) {
            if (check[i]) continue;
            check[i] = true;
            answer[L] = array[i];
            DFS(L + 1);
            check[i] = false;
        }
    }
}
