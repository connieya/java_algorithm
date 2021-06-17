package com.company.programmers.level1;

import java.util.Scanner;

public class Prime {
    static boolean array[] = new boolean[3000];

    public static void main(String[] args) {
        for (int i =2; i*i < array.length; i++){
            if (array[i]){
                continue;
            }
            for (int j= i+i; j< array.length; j+=i){
                array[j] = true;
            }
        }

        int nums[] = {1,2,4,5,10,20};

        int count =0;
        for (int i=0; i<nums.length-2; i++){

            for (int j=i+2; j<nums.length; j++){
                int sum =0;
                for (int k=0; k<2; k++){
                    sum += nums[i];
                    i++;
                }
                sum+= nums[j];
                if (!array[sum]){
                    count++;
                }
            }
        }

    }
}
