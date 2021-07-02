package com.company.baekjoon.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나이순정렬_10814_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder[] answer = new StringBuilder[201];
        for (int i=0; i<answer.length; i++){
            answer[i] = new StringBuilder();
        }
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            answer[age].append(age + " " + name+"\n");
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder builder : answer){
            sb.append(builder);
        }
        System.out.println(sb);

    }

}
