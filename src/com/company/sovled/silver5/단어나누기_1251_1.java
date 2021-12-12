package com.company.sovled.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 단어나누기_1251_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char str[] = br.readLine().toCharArray();
        int len = str.length;
        char answer[] = new char[len];
        char temp[] = new char[len];
        Arrays.fill(answer, 'z');
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                divideAndReverse(str, len, temp, i, j);
                if (String.valueOf(answer).compareTo(String.valueOf(temp)) > 0) {
                    for (int l=0; l<len; l++){
                        answer[l]  = temp[l];
                    }
                }
            }
        }
        System.out.println(String.valueOf(answer));
    }

    private static void divideAndReverse(char[] str, int len, char[] temp, int first, int secode) {
        for (int k = 0; k <= first; k++) {
            temp[k] = str[first - k];
        }
        for (int k = first + 1; k <= secode; k++) {
            temp[k] = str[secode - k + first + 1];
        }
        for (int k = secode + 1; k < len; k++) {
            temp[k] = str[len - k + secode];
        }
    }
}
