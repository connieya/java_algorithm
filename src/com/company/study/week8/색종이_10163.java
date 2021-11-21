package com.company.study.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이_10163 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int map [][] = new int[1001][1001];
        for (int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for (int j=a; j< a+c; j++){
                for (int k=b; k<b+d; k++){
                    map[j][k] = i;
                }
            }
        }

        for (int res = 1; res <=n; res++){
            int count = 0;
            for (int i=0; i<1001; i++){
                for (int j=0; j<1001; j++){
                    if (map[i][j]== res){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
