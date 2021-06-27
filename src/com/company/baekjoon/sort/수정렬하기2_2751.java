package com.company.baekjoon.sort;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 수정렬하기2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for (int x : list){
            bw.write(x+"\n");
        }
        bw.flush();
    }
}
