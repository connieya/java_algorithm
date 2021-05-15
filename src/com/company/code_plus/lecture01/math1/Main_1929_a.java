package com.company.code_plus.lecture01.math1;

import java.util.Scanner;

public class Main_1929_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean arr[] = new boolean[n + 1];
        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i * i <= n; i++) {
            if (arr[i] == true) continue;

            for (int j = i + i; j <= n; j+=i) {
                arr[j] = true;
            }
        }

        for (int i=m; i<=n; i++){
            if (arr[i] == false) System.out.println(i);
        }
    }
}
