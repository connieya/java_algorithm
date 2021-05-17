package com.company.code_plus.lecture01.math1;

import java.util.Scanner;

public class Main_9613 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            int arr[] = new int[k];
            for (int f=0; f<k; f++){
                arr[f] = sc.nextInt();
            }
            long  sum = 0;
            for (int m=0; m<k-1; m++){
                for (int x=m+1; x<k; x++){
                    sum += gcd(arr[m],arr[x]);
                }
            }
            System.out.println(sum);

        }



    }


}
