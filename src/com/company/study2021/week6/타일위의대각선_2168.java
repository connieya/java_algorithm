package com.company.study2021.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 타일위의대각선_2168 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        System.out.println(x+y - gcd(x,y));


        br.readLine();

    }
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b , a%b);
    }
}
