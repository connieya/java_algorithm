package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 메시지_1384 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        int group_num = 1;
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n== 0){
                break;
            }
            sb.append(String.format("Group %d\n",group_num++));
            int cnt = 0;
            String  arr[][] = new String[n][n];
            for (int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j=0; j<n; j++){
                    arr[i][j] = st.nextToken();
                }
            }
            for (int i=0; i<n; i++){
                for (int j=0; j<n; j++){
                    if (arr[i][j].equals("N")) {
                        int child_name = i - j;
                        if (child_name < 0) {
                            child_name += n;
                        }
                        sb.append(String.format("%s was nasty about %s\n",arr[child_name][0],arr[i][0]));
                        cnt++;
                    }
                }
            }
            if (cnt ==0){
                sb.append("Nobody was nasty\n");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
