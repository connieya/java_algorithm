package com.company.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_10818 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int answer [] = new int[2];
        answer[0] = arr[0];
        answer[1] = arr[n-1];

        for (int x : answer){
            System.out.print(x+" ");
        }



    }
}
