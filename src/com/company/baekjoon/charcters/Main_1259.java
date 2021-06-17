package com.company.baekjoon.charcters;

import java.util.Scanner;

public class Main_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String a = sc.next();
            if (a.equals("0")){
                break;
            }
            int b = Integer.parseInt(a);
            String sb = new StringBuilder(a).reverse().toString();
            int c = Integer.parseInt(sb);
            if (b==c){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }
    }
}
