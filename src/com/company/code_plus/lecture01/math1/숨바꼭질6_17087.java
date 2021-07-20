package com.company.code_plus.lecture01.math1;
import java.util.Scanner;

public class 숨바꼭질6_17087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int arr[] = new int[N];
        for (int i=0; i<N; i++){
            arr[i] = Math.abs(sc.nextInt()-S);
        }
        int a = arr[0];
        for (int i=1;i<N; i++){
            a = gcd(a,arr[i]);
        }
        System.out.println(a);
    }
    static int gcd(int a , int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
}
