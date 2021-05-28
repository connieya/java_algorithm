package com.company.baekjoon.math2;

import java.util.Scanner;

public class Main_4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int arr[] = new int[3];
            for (int i=0; i<3; i++){
                arr[i] = sc.nextInt();
            }
            if (arr[0] ==0 && arr[1] ==0 && arr[2]==0){
                break;
            }
            int max = -1;
            int sum= 0;
            for (int i =0; i<3; i++){
                if (arr[i]>max){
                    max = arr[i];
                }
                sum += arr[i]*arr[i];
            }
            if (sum/2 == max*max){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

        }

    }
}
