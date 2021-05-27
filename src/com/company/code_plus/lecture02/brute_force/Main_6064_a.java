package com.company.code_plus.lecture02.brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_6064_a {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- >0){
            String[] line = br.readLine().split(" ");
            int m = Integer.parseInt(line[0]);
            int n = Integer.parseInt(line[1]);
            int x = Integer.parseInt(line[2])-1;
            int y = Integer.parseInt(line[3])-1;

            boolean ok = false;
            for (int k =x; k<(n*m); k+=m){
                if (k%n ==y){
                    System.out.println(k+1);
                    ok = true;
                    break;
                }
            }
            if (!ok){
                System.out.println(-1);
            }
        }
    }
}
