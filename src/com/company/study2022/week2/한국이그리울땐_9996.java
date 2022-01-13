package com.company.study2022.week2;

import java.io.*;

public class 한국이그리울땐_9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int index = input.indexOf("*");
        String first = input.substring(0, index);
        String second = input.substring(index + 1);
        while (n-- > 0) {
            String answer = "NE";
            String str = br.readLine();
            if (str.length() >= input.length()-1) {
                String front = str.substring(0, index);
                String back = str.substring(str.length() - second.length());
                if (isEquals(first, front) && isEquals(second, back)) {
                    answer = "DA";
                }
            }
            bw.write(answer + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isEquals(String a, String b) {
        return a.equals(b);
    }
}
