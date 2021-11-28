package com.company.dongbinbook.question.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class 카드정렬하기_1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i=0; i<n; i++){
            pq.offer(Integer.parseInt(br.readLine()));
        }
        int result = 0;
        while (pq.size() !=1){
            int a= pq.poll();
            int b= pq.poll();
            result += a+b;
            pq.offer(a+b);
        }
        System.out.println(result);
        br.close();
    }
}
