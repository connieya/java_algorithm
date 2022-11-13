package com.company.study2022.week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 숫자판점프_2210 {
    static int dx [] = {-1,0,1,0};
    static int dy [] = {0,1,0,-1};
    static int digits[][];
    static int ans[];
    static Set<String > res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        digits = new int[5][5];
        ans = new int[6];
        res = new HashSet<>();
        for (int i=0; i<5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++) {
                digits[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                dfs(0,i,j);
            }
        }
        System.out.println(res.size());

    }

    public static void dfs(int L , int x , int y) {
        if (L==6){
            String str = "";
            for (int i=0; i<6; i++){
                str +=ans[i];
            }
            res.add(str);
            return;
        }
        for (int i=0; i<4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >=5 || ny < 0 || ny >= 5) continue;
            ans[L] = digits[x][y];
            dfs(L+1,nx,ny);
        }
    }
}
