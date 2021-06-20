package com.company.baekjoon;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            double sum = 0;
            for (int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double avg = sum/n;
            int count=0;
            for (int i=0; i<n; i++){
                if (arr[i]<=avg) count++;
            }
            System.out.println("#"+test_case+" "+count);
        }
    }

}
