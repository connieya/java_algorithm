package com.company.inflearn.sec02;

import java.util.ArrayList;
import java.util.Scanner;

public class Array07 {

    public int solution(int[] arr) {

        int count = 0;
        int sum = 0;
        for (int i = 0 ; i<arr.length; i++){
            if (arr[i] == 0){
                count = 0;
            }else{

                count++;
                sum+= count;

            }
        }

        return sum;

    }

    public static void main(String[] args) {

        Array07 A = new Array07();

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int array[] = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(A.solution(array));
    }

}
