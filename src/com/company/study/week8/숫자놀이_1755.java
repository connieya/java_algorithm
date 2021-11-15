package com.company.study.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Num implements Comparable<Num> {
    int number;
    String word;

    public Num(int number, String word) {
        this.number = number;
        this.word = word;
    }

    @Override
    public int compareTo(Num o) {
        return this.word.compareTo(o.word);
    }
}

public class 숫자놀이_1755 {
    public static void main(String[] args) throws IOException {
        String numbers[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        Num numArray[] = new Num[N-M+1];
        for (int i=M; i<=N; i++) {
            String str = String.valueOf(i);
            StringBuilder sb = new StringBuilder();
            for (char ch : str.toCharArray()){
                sb.append(numbers[ch-'0']).append(" ");
            }
            numArray[i-M] = new Num(i,sb.toString());
        }

        Arrays.sort(numArray);
        for (int i=0; i<numArray.length; i++) {
            System.out.print(numArray[i].number+" ");
            if(i %10 == 9) {
                System.out.println();
            }
        }
    }
}
