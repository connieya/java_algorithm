package com.company.dongbinbook.binarysearch;

public class 반복문이진탐색 {
    public static void main(String[] args) {
        int arr[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 21, 25, 91, 102};
        int target = 25;
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if (result == -1) {
            System.out.println("원소가 없습니다.");
        } else {
            System.out.println(result + 1);
        }

    }

}
