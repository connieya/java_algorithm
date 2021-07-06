package com.company.inflearn.sec07;

import java.util.Scanner;
public class 조합수 {
    static int array[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        array = new int[n+1][r+1];
        System.out.println(DFS(n,r));
    }
    static int DFS(int n , int r){
        if (n==r || r==0) return 1;
        else {
            if (array[n][r] !=0){
                return array[n][r];
            }else {
                return array[n][r] = DFS(n-1,r-1)+DFS(n-1,r);
            }
        }
    }
}
