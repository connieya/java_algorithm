package com.company.study2022.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 출석체크_20438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean students[] = new boolean[N+3];
        int psum[] = new int[N+3];
        Arrays.fill(psum,1);
        psum[0] = psum[1] = psum[2] = 0;
        List<Integer> sleep = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<K; i++){
            sleep.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int j=0; j < Q; j++) {
            int num = Integer.parseInt(st.nextToken());
            if (sleep.contains(num)) continue;
            for (int i=num; i<=N+2; i+=num){
                if (sleep.contains(i)){
                    continue;
                }
                psum[i] = 0;
            }
        }
        for (int i=4; i<=N+2; i++){
            psum[i] += psum[i-1];
        }
        while (M-- > 0){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(psum[b]-psum[a-1]);
        }
    }
}
