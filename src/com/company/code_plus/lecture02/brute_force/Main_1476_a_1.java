package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class Main_1476_a_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt()-1;
        int s = sc.nextInt()-1;
        int m = sc.nextInt()-1;
        for (int i=0;; i++){
            if (i%15 ==e && i%28 ==s && i%19 ==m){
                System.out.println(i+1);
                break;
            }
        }
    }
}
