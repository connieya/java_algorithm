package com.company.code_plus.lecture01.math1;

import java.util.Scanner;

public class Main_2609_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int g =1;
        for (int i=2; i<Math.min(a,b); i++){
            if ( a%i ==0 && b%i == 0){
                g = i;
            }
        }
        int l = a*b/g;
        System.out.println(g);
        System.out.println(l);

    }
}
