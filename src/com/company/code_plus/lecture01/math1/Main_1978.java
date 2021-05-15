package com.company.code_plus.lecture01.math1;

import java.util.Scanner;
public class Main_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count= 0;
        for (int i=0; i<n; i++){
            int c = sc.nextInt();
            if (isPrime(c)) count++;
        }
        System.out.println(count);
    }
    public static boolean isPrime(int n) {
        if (n<2) return false;

        for (int i=2; i*i <=n; i++){
            if (n%i ==0) return false;
        }

        return true;

    }

}
