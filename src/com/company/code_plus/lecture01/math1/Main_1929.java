package com.company.code_plus.lecture01.math1;

import java.util.Scanner;

public class Main_1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i=a; i<=b; i++){
            if (isPrime(i)) System.out.println(i);
        }
    }
    public static boolean isPrime(int a){
        if (a<2) return false;
        for (int i=2; i*i <=a; i++){
            if (a%i ==0) return false;
        }
        return true;
    }
}
