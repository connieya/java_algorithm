package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class Main_6064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();

        while (T-- >0){
            int M = sc.nextInt();
            int N = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a =1, b=1;
            int count =1;
            int max = 0;
            while (a != x || b != y){
                a++; b++; count++;
                if (a == M && b == N){
                    count = -1;
                    break;
                }
                if (count>max){

                }
                if (a==M)  {
                    a = 0;
                }
                if (b== N){
                    b=0;
                }



            }
            System.out.println(count);
        }


    }
}
