package com.company.dongbinbook.binarysearch;

public class 재귀함수이진탐색 {
    public static void main(String[] args) {
        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
        int target = 5;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println(result + 1);
        }
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, 0, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, end);
    }
}
