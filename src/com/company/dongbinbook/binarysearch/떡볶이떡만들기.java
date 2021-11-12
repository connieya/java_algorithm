package com.company.dongbinbook.binarysearch;

import java.util.Arrays;

public class 떡볶이떡만들기 {
    public static void main(String[] args) {
        int riceCake[] = {19, 15, 10, 17};
        int m = 6;
        Arrays.sort(riceCake);
        int max = riceCake[riceCake.length - 1];
        int start = 0;
        int answer = -1;
        while (start <= max) {
            int mid = (start + max) / 2;
            int sum = 0;
            for (int rice : riceCake) {
                if (rice > mid) {
                    sum += (rice - mid);
                }
            }

            if (sum >= m) {
                answer = mid;
                start = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
