package com.company.study.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 단어수학_1339 {
    static int n;
    static String words[];
    static int alpha[] = new int[26];
    static Set<Character> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
            int len = words[i].length()-1;
            for (int j = 0; j < words[i].length(); j++) {
                char cj = words[i].charAt(j);
                alpha[cj - 'A'] += (int) Math.pow(10, len--);
            }
        }
        Arrays.sort(alpha);
        int index = 9;
        int sum =0;
        for (int i=alpha.length-1; i>=0; i--){
            if (alpha[i] == 0) {
                break;
            }
            sum += alpha[i] * index;
            index--;
        }
        System.out.println(sum);


        br.close();
    }


}
