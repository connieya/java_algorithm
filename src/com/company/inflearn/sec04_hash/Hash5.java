package com.company.inflearn.sec04_hash;

import java.util.ArrayList;

public class Hash5 {

    public static void main(String[] args) {

        int arr[] = new int[]{13, 15, 34, 23, 45, 65, 33, 11, 26, 42};

        ArrayList<Integer> answer = new ArrayList<>();

        int sum = 0;
        int lt = 0 , rt =0;
        for (int i = lt; i<2+lt; i++) {

            sum += arr[i];
            System.out.println("i = " +i +" sum ="+sum);


            while (i >= 1+lt){
                for ( rt = 2+lt; rt < arr.length; rt++) {
                    sum += arr[rt];
                    answer.add(sum);
                    sum -= arr[rt];
                }

                lt++;
            }

        }





        for (int x : answer) {
            System.out.print(x + " ");
        }

    }
}
