package com.company.baekjoon.for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char c = '*';
        String answer = "";
        for (int i=0; i<n; i++){
            answer +=c;
            System.out.println(answer);
        }

    }
}
