package com.company.programmers.level1;

import java.util.ArrayList;

public class 같은숫자는싫어 {
    static ArrayList<Integer> Solution(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i=1 ; i<arr.length; i++){
            if (arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {

        int [] arr = {4,4,4,3,3};
        System.out.println(Solution(arr));
    }
}

