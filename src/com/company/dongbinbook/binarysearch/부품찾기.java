package com.company.dongbinbook.binarysearch;

import java.util.Arrays;

public class 부품찾기 {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {8,3,7,9,2};
        int m = 3;
        int answer [] = {5,7,9};
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int a : answer) {
            int result = binarySearch(arr,a,0,arr.length-1);
            if (result == -1) {
                sb.append("no ");
            }else {
                sb.append("yes ");
            }
        }
        System.out.println(sb);
    }
    public static int binarySearch(int arr[], int target, int start , int end ) {
        if (start >end) {
            return -1;
        }
        int mid = (start+end)/2;
        if (arr[mid] == target) {
            return mid;
        }else if (arr[mid] > target) {
            return binarySearch(arr,target,start,mid-1);
        }
        return binarySearch(arr,target,mid+1,end);
    }
}
