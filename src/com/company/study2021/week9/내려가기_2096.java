package com.company.study2021.week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 내려가기_2096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max [] = new int[3];
        int min [] = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        max[0] =a;
        max[1] = b;
        max[2] = c;
        min[0] =a;
        min[1] = b;
        min[2] = c;


        for (int i=0; i<n-1; i++){
            st = new StringTokenizer(br.readLine());
            a= Integer.parseInt(st.nextToken());
            b= Integer.parseInt(st.nextToken());
            c= Integer.parseInt(st.nextToken());

            int prevZero = max[0];
            int prevTwo = max[2];
            max[0] = a+ Math.max(max[0],max[1]);
            max[2] = c+ Math.max(max[1],max[2]);
            max[1] = b + Math.max(prevTwo ,Math.max(prevZero , max[1]));

            int prevZero2 = min[0];
            int prevTwo2 = min[2];
            min[0] = a+ Math.min(min[0],min[1]);
            min[2] = c+ Math.min(min[1],min[2]);
            min[1] = b + Math.min(prevZero2 ,Math.min(prevTwo2 , min[1]));
        }
        System.out.println(Math.max(max[0],Math.max(max[1],max[2])));
        System.out.println(Math.min(min[0],Math.min(min[1],min[2])));
    }
}
