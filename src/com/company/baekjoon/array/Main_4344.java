package com.company.baekjoon.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main_4344 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for (int i = 0; i<c; i++){

            int n = sc.nextInt();

            double array[] = new double[n];

            for (int j=0; j<n; j++){
               array[j] = sc.nextInt();
            }
            double avg = Arrays.stream(array).average().getAsDouble();
            double count = 0;
            for (int k=0; k<n; k++){
                if (array[k] > avg) count++;
            }
            double v = (count / n)*100;
            System.out.println(String.format("%.3f",v)+"%");

        }
    }
}
