package com.company.inflearn.sec07;

import java.util.Scanner;

public class 이진수출력_재귀 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binary(n);
    }
    static void binary(int n){
        if (n==0) return;
        binary(n/2);
        System.out.print(n%2);
    }
}
