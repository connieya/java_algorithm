package com.company.programmers.level2;

import java.util.Arrays;

public class 소수찾기 {
    static boolean prime[];

    public static void main(String[] args) {
        String numbers = "011";
        int arr[] = new int[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            arr[i] = numbers.charAt(i)-'0';
        }
        Arrays.sort(arr);
        do {
            String tmp = "";
            for (int i=0; i<arr.length; i++){
                tmp += arr[i];
                int num = Integer.parseInt(tmp);
                System.out.println(num);
            }

        }while (next_permutation(arr));

    }
    public static boolean next_permutation(int arr[]) {
        int i = arr.length - 1;
        while(i > 0 && arr[i-1] >= arr[i] ) {
            i--;
        }
        if(i <= 0) return false;
        int j = arr.length -1;

        while(arr[i-1] >= arr[j]) {
            j--;
        }
        int temp = arr[i-1];
        arr[i-1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while( i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return true;
    }

    public static void init() {
        prime = new boolean[10_000_000];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                continue;
            }
            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }
}
