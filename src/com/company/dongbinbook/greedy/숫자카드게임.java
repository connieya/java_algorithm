package com.company.dongbinbook.greedy;

import java.util.Scanner;

public class 숫자카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행
        int m = sc.nextInt(); // 열
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            int min = Integer.MAX_VALUE;
            for (int j=0; j<m; j++){
                int x = sc.nextInt();
                min = Math.min(min,x);
            }
            max = Math.max(min,max);
        }
        System.out.println(max);
    }
}
