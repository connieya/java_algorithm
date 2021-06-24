package com.company.inflearn;

import java.util.Scanner;

public class Main {
    static int memory[];
    static int Fibo(int n){
        if (n<=1) return n;


        if (memory[n]>0){
            return memory[n];
        }
        memory[n] = Fibo(n-1)+Fibo(n-2);
        return memory[n];

    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        memory = new int[n+1];
        System.out.println(Fibo(n));
    }
}
