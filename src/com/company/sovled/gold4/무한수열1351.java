package com.company.sovled.gold4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 무한수열1351 {
    static long P, Q;
    static Map<Long, Long> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());
        System.out.println(dp(N));
    }

    public static long dp(long num) {
        if (num == 0) {
            return 1;
        }
        if (map.containsKey(num)) {
            return map.get(num);
        }
        map.put(num , dp(num/P)+dp(num/Q));
        return map.get(num);
    }
}
