package com.company.study.week10;

import java.io.*;

public class FridgeOfYourDream_11104_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n -- > 0) {
            String str = br.readLine();
            int sum = 0;
            int index = 23;
            for (char ch : str.toCharArray()){
                if (ch=='1'){
                    sum += Math.pow(2,index);
                }
                index--;
            }
            sb.append(sum).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
