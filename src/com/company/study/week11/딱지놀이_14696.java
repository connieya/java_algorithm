package com.company.study.week11;

import java.io.*;
import java.util.StringTokenizer;

public class 딱지놀이_14696 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String result = "D";
        while (n-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int game_result[] = new int[5];
            int a = Integer.parseInt(st.nextToken());
            for (int i=1; i<=a;i++){
                int shape = Integer.parseInt(st.nextToken());
                game_result[shape]++;
            }
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            for (int i=1; i<=b; i++){
                int shape = Integer.parseInt(st.nextToken());
                game_result[shape]--;
            }
            result = "D";
            for (int i =4; i>=1; i--){
                if (game_result[i] == 0){
                    continue;
                }else if (game_result[i] > 0){
                    result = "A";
                    break;
                }else {
                    result = "B";
                    break;
                }
            }
            sb.append(result).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
