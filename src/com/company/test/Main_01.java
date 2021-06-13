package com.company.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long mon =6 , wen=7 , sat=1, sun=2 ,min=0,max=0;
        for (int i=1; i<=n; i+=7){
            if (mon <=n){
                min++;
            }
            if (wen<=n){
                min++;
            }
            if (sat<=n){
                max++;
            }
            if (sun<=n){
                max++;
            }
            mon+=7;
            wen+=7;
            sat+=7;
            sun+=7;
        }
        ArrayList<Long> answer = new ArrayList<>();
        answer.add(min);
        answer.add(max);
        System.out.println(answer);


    }
}
