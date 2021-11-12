package com.company.dongbinbook.binarysearch;

import java.util.Arrays;

public class 부품찾기_계수정렬 {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {8,3,7,9,2,12,34,11,1,2,3};
        int m = 3;
        int answer [] = {5,7,9,1,21,30};
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int map[] = new int[max+1];
        for (int a : arr){
            map[a]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int a : answer) {
            if (map[a] == 0) {
                sb.append("no ");
            }else {
                sb.append("yes ");
            }
        }
        System.out.println(sb);

    }
}
