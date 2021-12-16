package com.company.study.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 미아노트_20114 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        char ans[] = br.readLine().toCharArray();
        --H;
        while (H-- > 0) {
            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '?') {
                    ans[i] = str.charAt(i);
                }
            }
        }
        int len = N*W;
        for (int i=0; i<=len-W; i+=W){
            boolean flag =false;
            for (int j=i; j<i+W; j++){
               if (ans[j] != '?'){
                   flag = true;
                   sb.append(ans[j]);
                   break;
               }
            }
            if (!flag){
                sb.append("?");
            }
        }
        System.out.println(sb);

        br.close();
    }
}
