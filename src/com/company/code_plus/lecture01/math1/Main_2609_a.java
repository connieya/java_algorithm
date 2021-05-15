package com.company.code_plus.lecture01.math1;

import java.util.Scanner;

public class Main_2609_a {
    public static int gcd(int x, int y){
        if (y==0){
            return x;
        }else {
            return gcd(y,x%y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g = gcd(a,b);
        int l = a * b /g;
        System.out.println(g);
        System.out.println(l);

    }
}
