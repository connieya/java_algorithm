package com.company.study.str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 네수_10824 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String arr[] = new String[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = st.nextToken();
        }
        String first = arr[0] + arr[1];
        String second = arr[2] + arr[3];
        long num1 = Long.parseLong(first);
        long num2 = Long.parseLong(second);
        System.out.println(num1+num2);
    }
}
