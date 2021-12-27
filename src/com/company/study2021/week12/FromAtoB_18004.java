package com.company.study2021.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FromAtoB_18004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int cnt = 0;
        while (a > b) {
             if (a%2==0){
                 a /= 2;
                 cnt++;
             }else {
                 a++;
                 cnt++;
             }
        }
        cnt += b-a;
        System.out.println(cnt);
    }
}
