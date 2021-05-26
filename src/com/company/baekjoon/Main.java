package com.company.baekjoon;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for (char ch : str.toCharArray()){

           if ((ch-65) <=2){
               count += 3;
           }else if ((ch-65)<=5){
               count += 4;
           }else if((ch-65)<=8){
               count+=5;
           }else if ((ch-65) <=11){
               count+=6;
           }else if((ch-65) <= 14){
               count+=7;
           }else if ((ch-65) <= 18){
               count+=8;
           }else if((ch-65) <=21){
               count+=9;
           }else {
               count+=10;
           }
        }
        System.out.println(count);

    }
}
