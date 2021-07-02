package com.company.inflearn.sec07;

import java.util.Scanner;

public class 재귀함수_스택프래임 {
    static void DFS(int n){
        if (n==0) return;

        DFS(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        DFS(N);
    }
}
