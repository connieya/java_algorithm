package com.company.inflearn.sec09_greedy;

import java.util.Scanner;

public class 씨름선수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int height[] = new int[N];
        int weight[] = new int[N];

        for (int i=0; i<N; i++){
            height[i] =sc.nextInt();
            weight[i] =sc.nextInt();

        }
        int count=0;

        for (int i=0; i<N; i++){
            boolean check = true;
            for (int j=0; j<N; j++){
                if (height[j]> height[i] && weight[j]>weight[i]){
                    check = false;
                }
            }
            if (check) count++;
        }
        System.out.println(count);
    }
}
