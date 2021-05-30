package com.company.baekjoon.avatar;

import java.util.Scanner;

public class Main_2445_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print("*");
            }

            for (int j=2*n-i; j >0; j--){
                if (j >i){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (int i=1; i<n; i++){
            for (int j=0; j<n-i; j++){
                System.out.print("*");
            }

            for (int j= 2*n-(n-i); j>0; j--){
                if (j>(n-i)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
