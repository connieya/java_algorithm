package com.company.baekjoon;

import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b){
        if (b==0){
            return a;
        }else {
            return gcd(b,a%b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(gcd(gcd(a,b),c));
    }
}
