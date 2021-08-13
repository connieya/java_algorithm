package com.company.programmers.level2;

public class 소수찾기 {
    public static void main(String[] args) {
        String numbers = "017";
        String[] numbersArr = numbers.split("");

        boolean prime[] = new boolean[10_000_001];
        boolean check[]= new boolean[10_000_001];
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) continue;

            for (int j = i + i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        int count =0;
        for (String s : numbersArr) {
            if (!prime[Integer.valueOf(s)] && !check[Integer.valueOf(s)]){
                check[Integer.valueOf(s)] = true;
                count++;
            }
        }

        int arr[] = new int[numbers.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        do {
            StringBuilder sb = new StringBuilder();
            for (int i : arr) {
                sb.append(numbersArr[i]);
            }
            int isPrime = Integer.valueOf(sb.toString());
            if (!prime[isPrime] && !check[isPrime]) {
                check[isPrime] = true;
                count++;
            }

        } while (next_permutation(arr));

        System.out.println(count);
    }

    public static boolean next_permutation(int[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }

        int j = arr.length - 1;
        while (arr[i - 1] >= arr[j]) {
            j--;
        }

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while (i < j) {
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        return true;
    }
}
