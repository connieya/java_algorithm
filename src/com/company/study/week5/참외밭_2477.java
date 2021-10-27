package com.company.study.week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 참외밭_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        List<Integer> east_west = new ArrayList<>();
        List<Integer> north_south = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (s == 1 || s == 2) {
                east_west.add(v);
            } else {
                north_south.add(v);
            }
        }
        Collections.sort(east_west);
        Collections.sort(north_south);
        int max = east_west.get(2) * north_south.get(2);
        int min = east_west.get(0) * north_south.get(0);
        System.out.println((max - min) * k);
    }
}
