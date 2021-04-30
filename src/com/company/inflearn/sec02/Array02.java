package com.company.inflearn.sec02;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int array[] = new int[num];

        for (int i=0; i< array.length; i++){
            array[i] = sc.nextInt();
        }

        int max = array[0];
        int count = 1;
        for (int j=0; j<array.length; j++){

            if (max < array[j]){
                max = array[j];
                count++;
            }
        }

        System.out.println(count);
    }
}
