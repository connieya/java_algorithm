package com.company.sovled.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어나누기_1251 {
    static String str;
    static int len;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();
        len = str.length();
        String temp = "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                String divide = divideStr(i,j);
                if (temp.compareTo(divide) > 0){
                    temp = divide;
                }
            }
        }
        System.out.println(temp);
    }

    public static String divideStr(int first, int second) {
        StringBuilder sb = new StringBuilder();
        String a = "";
        String b = "";
        String c = "";
        for (int i = 0; i <= first; i++) {
            a += str.charAt(i);
        }
        for (int i = first + 1; i <= second; i++) {
            b += str.charAt(i);
        }
        for (int i = second + 1; i < len; i++) {
            c += str.charAt(i);
        }
        sb.append(new StringBuilder(a).reverse())
                .append(new StringBuilder(b).reverse())
                .append(new StringBuilder(c).reverse());
        return sb.toString();
    }
}
