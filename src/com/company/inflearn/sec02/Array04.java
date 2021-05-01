package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array04 {

    public int[] solution(int s , int n[]){
        n[0] = 1;
        n[1] = 1;
        for (int i = 2; i < s; i++) {
            n[i] = n[i - 1] + n[i - 2];
        }
        return n;

    }

    public static void main(String[] args) {

        Array04 A = new Array04();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int array[] = new int[num];

        for (int x : A.solution(num , array)){
            System.out.print(x +" ");
        }
    }
}
