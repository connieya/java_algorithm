package com.company.study2021.week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 종이자르기_2628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int array[][] = new int[n][2];
        List<Integer> horizontal = new ArrayList<>();
        List<Integer> vertical = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0) {
                horizontal.add(b);
            } else if (a == 1) {
                vertical.add(b);
            }
        }
        Collections.sort(horizontal, Collections.reverseOrder());
        Collections.sort(vertical, Collections.reverseOrder());
        int vertical_max , horizontal_max;
        if (horizontal.isEmpty()) {
            vertical_max = y;
        } else {
            vertical_max = y - horizontal.get(0);
            int len = horizontal.size() - 1;
            for (int i = 0; i < len; i++) {
                vertical_max = Math.max(vertical_max, horizontal.get(i) - horizontal.get(i + 1));
            }
            vertical_max = Math.max(vertical_max, horizontal.get(len) - 0);
        }

        if (vertical.isEmpty()) {
             horizontal_max = x;
        } else {
             horizontal_max = x - vertical.get(0);
            int len2 = vertical.size() - 1;
            for (int i = 0; i < len2; i++) {
                horizontal_max = Math.max(horizontal_max, vertical.get(i) - vertical.get(i + 1));
            }
            horizontal_max = Math.max(horizontal_max, vertical.get(len2) - 0);
        }

        System.out.println(vertical_max * horizontal_max);
    }
}
