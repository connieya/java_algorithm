package com.company.sovled.silver4;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 나는야포켓몬마스터이다솜_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String arr[] = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            String input = br.readLine();
            map.put(input, i);
            arr[i] = input;
        }
        for (int i = 0; i < m; i++) {
            String input = br.readLine();
            if (Character.isDigit(input.charAt(0))) {
                bw.write(arr[Integer.parseInt(input)] + "\n");
            } else {
                bw.write(map.get(input) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
