package com.company.code_plus.lecture02.brute_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class 암호만들기_1759 {
    static int L, C;
    static String answer[], arr[];
    static boolean check[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();
        answer = new String[L];
        arr = new String[C];
        check = new boolean[C];
        for (int i = 0; i < C; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        go(0);
    }

    public static void go(int s) {
        if (s == L-1) {
            for (String str : answer) {
                System.out.print(str);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < C; i++) {
            if (check[i]) {
                continue;
            }
            answer[s] = arr[i];
            check[i] = true;
            go(s + 1);
            check[i] = false;
        }
    }
}
