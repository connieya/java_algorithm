package com.company.study2021.exam;

import java.util.Scanner;

public class 부분집합 {
    static int n;
    static boolean arr[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        arr = new boolean[n + 1];
        dfs(1);
    }

    public static void dfs(int i) {
        if (i == n + 1) {
            String temp = "";
            for (int j=1; j<n+1; j++) {
                if (arr[j]) {
                    temp +=j+" ";
                }
            }
            if (temp.length()>0){
                System.out.println(temp);
            }
            return;
        }

        arr[i] = true;
        dfs(i + 1);
        arr[i] = false;
        dfs(i + 1);

    }
}
