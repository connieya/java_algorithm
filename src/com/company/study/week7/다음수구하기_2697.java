package com.company.study.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 다음수구하기_2697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String str = br.readLine();
            char array[] = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                array[i] = str.charAt(i);
            }
            if (next_permutation(array)) {
                StringBuilder sb = new StringBuilder();
                for (char c : array) {
                    sb.append(c);
                }
                System.out.println(sb);
            }else{
                System.out.println("BIGGEST");
            }

        }
    }
    public static boolean next_permutation(char[] array) {
        int i = array.length - 1;
        while (i > 0 && array[i - 1] >= array[i]) {
            i--;
        }
        if (i == 0) {
            return false;
        }

        int j = array.length - 1;
        while (array[i - 1] >= array[j]) {
            j--;
        }
        char temp = array[i - 1];
        array[i - 1] = array[j];
        array[j] = temp;

        j = array.length - 1;
        while (i < j) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
            i++;
            j--;
        }

        return true;

    }
}
