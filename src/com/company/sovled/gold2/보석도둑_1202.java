package com.company.sovled.gold2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 보석도둑_1202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int jewelry[][] = new int[N][2];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            jewelry[i][0] = w;
            jewelry[i][1] = c;
        }
        TreeSet<Integer> bags = new TreeSet<>();
        while (K-- > 0) {
            int w = Integer.parseInt(br.readLine());
            bags.add(w);
        }
        int ans = 0;
        Arrays.sort(jewelry, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1]-o1[1];
            }
        });
        for (int i=0; i<N; i++){
            int w = jewelry[i][0];
            int c = jewelry[i][1];
            if(w <= bags.first()){
                ans += c;
                bags.remove(bags.first());
            }
        }
        System.out.println(ans);
    }
}
