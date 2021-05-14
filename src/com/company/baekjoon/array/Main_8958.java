package com.company.baekjoon.array;

import java.util.Scanner;

public class Main_8958 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++){
            String str = sc.next();

            int count = 0;
            int sum = 0;
            for (char c : str.toCharArray()){
                if (c == 'O'){
                    count++;
                }else{
                    count = 0;
                }

                sum += count;
            }

            System.out.println(sum);
        }

    }
}
