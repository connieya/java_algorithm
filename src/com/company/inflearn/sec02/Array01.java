package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array01 {

    public void solution(int[] n){

        System.out.print(n[0]+" ");
        for (int j=0; j<n.length-1; j++){
            if (n[j] <n[j+1]){
                System.out.print(n[j+1]+" ");
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int array[] = new int[num];
        for (int i=0; i< array.length; i++){
            array[i] = sc.nextInt();
        }

        Array01 A = new Array01();
        A.solution(array);
    }
}
