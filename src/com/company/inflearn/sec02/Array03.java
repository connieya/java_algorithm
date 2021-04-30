package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int A[] = new int[num];
        int B[] = new int[num];

        for (int i=0; i< num; i++){
            A[i] = sc.nextInt();
        }

        for (int i=0; i< num; i++){
            B[i] = sc.nextInt();
        }

        for (int i=0; i< num; i++){
            if (A[i] == B[i]){
                System.out.println("D");
            }else if(A[i] == 3 && B[i] == 1){
                System.out.println("B");

            }else if(A[i] ==1 && B[i] ==3){
                System.out.println("A");
            }else{
                String result = (A[i] > B[i]) ? "A" : "B";
                System.out.println(result);
            }
        }
    }
}
