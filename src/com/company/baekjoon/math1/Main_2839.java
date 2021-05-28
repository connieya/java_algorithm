package com.company.baekjoon.math1;

import java.util.Scanner;

public class Main_2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean arr[] = new boolean[n+1];
        for (int i=1; i<=n; i++){
                if (3*i <=n) arr[3*i] = true;
                if (5*i<=n) arr[5*i] = true;
                if ((3*i)+5 <=n) arr[(3*i)+5] =true;
                if ((5*i)+3<=n) arr[((5*i)+3)] = true;

        }
        if (arr[n]){
           if (n%5==0){
               System.out.println(n/5);
           }else {
               int x =0;
               while (n%5 !=0){
                   n -= 3;
                   x++;
               }
               System.out.println((n/5) +x);
           }

        }else{
            System.out.println(-1);
        }
    }
}
