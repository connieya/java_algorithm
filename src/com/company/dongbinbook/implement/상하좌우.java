package com.company.dongbinbook.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 상하좌우 {
    public static void main(String[] args) throws IOException {
        int position[] = new int[2];
        Arrays.fill(position, 1);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String[] split = br.readLine().split(" ");
        for (String s : split) {
            if (s.equals("R") && position[1] < n) {
                position[1] += 1;
            }
            if (s.equals("L") && position[1] > 1) {
                position[1] -= 1;
            }
            if (s.equals("U") && position[0] > 1) {
                position[0] -= 1;
            }
            if (s.equals("D") && position[0] < n) {
                position[0] += 1;
            }
        }
        System.out.println(position[0]+" "+position[1]);
    }
}
