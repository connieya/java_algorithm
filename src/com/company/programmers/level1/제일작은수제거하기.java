package com.company.programmers.level1;


import java.util.Arrays;

public class 제일작은수제거하기 {
    public static void main(String[] args) {
        int arr [] = {10};
        if (arr.length<=1){
            arr = new int[]{-1};
        }else{
            int min = Arrays.stream(arr).min().getAsInt();
            arr = Arrays.stream(arr).filter(i -> i != min).toArray();
        }

        for (int x : arr){
            System.out.print(x+" ");
        }

    }
}
