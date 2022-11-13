package com.company.study2021.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 악수_8394 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 2;
        for (int i = 2; i <= n; i++) {
            int temp = y;
            y = (x + y) % 10;
            x = temp;
        }
        System.out.println(x);
    }
}
