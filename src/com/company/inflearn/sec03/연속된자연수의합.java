package com.company.inflearn.sec03;

import java.util.Scanner;

public class 연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i=1; i<=n/2; i++){
            int sum=0;
            int j = i;
            while (true){
                if (sum > n) break;
                if (sum ==n){
                    count++;
                    break;
                }
                sum +=j;
                j++;
            }
        }
        System.out.println(count);
    }
}

