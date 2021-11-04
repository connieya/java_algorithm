package com.company.study.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 부등호_2529 {
    static int num[];
    static String str[];
    static boolean visited[] = new boolean[10];
    static List<String> ans = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        str = new String[k];
        num = new int[k + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            str[i] = st.nextToken();
        }
        dfs(0 , "" , k+1);
        Collections.sort(ans);
        System.out.println(ans.get(ans.size()-1));
        System.out.println(ans.get(0));
    }

    public static void dfs(int L, String num ,int k) {
        if (L==k) {
            ans.add(num);
            return;
        }

        for (int i=0; i<=9; i++) {
            if (!visited[i] &&  (L ==0 || isValid(Character.getNumericValue(num.charAt(L-1)) , i , str[L-1]))){
                visited[i] = true;
                dfs(L+1 , num+i , k);
                visited[i] = false;
            }
        }
    }
    public static boolean isValid(int a , int b , String c) {
        if (c.equals(">")) {
            if (a < b) {
                return false;
            }
        }

        if (c.equals("<")){
            if (a> b) {
                return  false;
            }
        }
        return true;
    }
}
