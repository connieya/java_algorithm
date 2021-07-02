package com.company.baekjoon.sort;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 나이순정렬_10814_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String array[][] = new String[N][2];
        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0]= st.nextToken();
            array[i][1]= st.nextToken();
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });
        for (String str[] : array){
            sb.append(str[0]+" "+str[1]+"\n");
        }
        System.out.println(sb);
    }
}
