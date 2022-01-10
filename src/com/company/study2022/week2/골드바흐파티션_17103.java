package com.company.study2022.week2;

import java.io.*;

public class 골드바흐파티션_17103 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        boolean prime[] = new boolean[1000_001];
        prime[1] = true;
        for (int i=2; i*i<=1000_000; i++){
            if (prime[i]){
                continue;
            }
            for (int j=i+i; j<=1000_000; j+=i){
                prime[j] = true;
            }
        }

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int half = n/2;
            int count = 0;
            for(int i=2; i<=half; i++){
                if (prime[i]) continue;
                if (!prime[i] && !prime[n-i]){
                    count++;
                }
            }
            bw.write(count+"\n");

        }
        bw.flush();
        bw.close(); br.close();
    }
}
