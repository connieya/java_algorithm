package com.company.study.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 민균이의비밀번호_9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        int answer = 0;
        Label:
        for (int j = 0; j < N; j++) {
            String reverse = new StringBuilder(arr[j]).reverse().toString();
            if (reverse.equals(arr[j])) {
                System.out.println(arr[j].length() + " " + arr[j].charAt(arr[j].length() / 2));
                break;
            }
            for (int k = j + 1; k < N; k++) {
                if (reverse.equals(arr[k])) {
                    System.out.println(arr[k].length() + " " + arr[k].charAt(arr[k].length() / 2));
                    break Label;
                }
            }
        }
    }
}
