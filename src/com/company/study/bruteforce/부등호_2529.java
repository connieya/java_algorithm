package com.company.study.bruteforce;

import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;

public class 부등호_2529 {
    static int num[];
    static String str[];
    static boolean visited[] = new boolean[10];
    static long MAX = Integer.MIN_VALUE;
    static long MIN = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        str = new String[k];
        num = new int[k + 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            str[i] = st.nextToken();
        }
        dfs(0, k + 1);
        if (MAX < 0) {
            System.out.println("0"+MAX);
        }else {
            System.out.println(MAX);
        }
        if (MIN <0) {
            System.out.println("0"+MIN+"");
        }else {
            System.out.println(MIN);
        }

    }

    public static void dfs(int L, int k) {
        if (L == k) {
            boolean flag = false;
            for (int i = 0; i < num.length - 1; i++) {
                String v = str[i];
                if (v.equals("<") && num[i] < num[i+1]){
                    flag =true;
                }else if (v.equals(">")  && num[i] > num[i+1]){
                    flag = true;
                }else {
                    return;
                }
            }
            if (flag) {
                String n = "";
                for (int a : num) {
                    n += a + "";
                }
                long parse = Long.parseLong(n);
                MAX = Math.max(MAX, parse);
                MIN = Math.min(MIN, parse);
            }
            return;
        }
        for (int i = 0; i <= 9; i++) {
            if (!visited[i]) {
                visited[i] = true;
                num[L] = i;
                dfs(L + 1, k);
                visited[i] = false;
            }
        }
    }
}
