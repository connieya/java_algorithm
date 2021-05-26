package com.company.code_plus.lecture02.brute_force;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2309_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int [9];
        int sum =0;
        for (int i=0; i<9; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        for (int i=0; i<9; i++){
            for (int j=i+1; j<9; j++){
                if (sum -a[i]-a[j] == 100){
                    for (int k=0; k<9; k++){
                        if (i == k | j==k){
                            continue;
                        }
                        System.out.println(a[k]);
                    }
                    System.exit(0);
                }
            }
        }
    }
}
