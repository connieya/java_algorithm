package com.company.dongbinbook.binarysearch;

import java.util.Arrays;

public class 떡볶이떡만들기 {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        int riceCake[] = {19, 15, 10, 17};
        Arrays.sort(riceCake);
        int start = 0;
        int end = riceCake[n - 1];
        int answer = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            int target = 0;
            for (int cake : riceCake) {
                if (cake > mid) {
                    target += cake - mid;
                }
            }
            if (target >= m) {
                answer = mid;
                start = mid+1;
            } else {
                end = mid -1;
            }
        }
        System.out.println(answer);

    }
}
