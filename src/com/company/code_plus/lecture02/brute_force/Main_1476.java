package com.company.code_plus.lecture02.brute_force;

import java.util.Scanner;

public class Main_1476 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i=0; i<3; i++){
            arr[i] = sc.nextInt();

        }
        int e=0,s=0,m=0;
        int count=0;
        while (true){
            e++; s++; m++;
            count++;
            if (e==arr[0] && s==arr[1] && m==arr[2]){
                break;
            }
            if (e==15){
                e =0;
            }
            if (s==28){
                s=0;
            }
            if (m==19){
                m=0;
            }
        }
        System.out.println(count);
    }
}
