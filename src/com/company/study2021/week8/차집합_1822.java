package com.company.study2021.week8;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class 차집합_1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < a; i++) {
            treeSet.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int value = Integer.parseInt(st.nextToken());
            if (treeSet.contains(value)){
                treeSet.remove(value);
            }
        }
        if (treeSet.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(treeSet.size());
            for (int i : treeSet) {
                bw.write(i + " ");
            }
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
