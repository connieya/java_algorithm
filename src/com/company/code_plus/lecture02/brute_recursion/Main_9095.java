package com.company.code_plus.lecture02.brute_recursion;

import java.util.Scanner;

public class Main_9095 {
    static int memorization[] = new int[100];
    public static int recursion(int n){
        if (memorization[n]>0) return memorization[n];
        if (n<=2) {
            return memorization[n] =n;
        }else if (n==3){
            return 4;
        }else {
            return memorization[n]= recursion(n-1)+recursion(n-2)+recursion(n-3);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0){
            int n = sc.nextInt();
            System.out.println(recursion(n));
        }
    }
}
