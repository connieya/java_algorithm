package com.company.programmers.level1;

import java.util.ArrayList;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int arr[] = {5,9,7,10};
        int n = 5;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<arr.length; i++){
            if (arr[i]%n ==0) list.add(arr[i]);
        }
        list.set(0,list.get(1));
        for (int x : list){
            System.out.print(x+ " ");
        }


    }
}
