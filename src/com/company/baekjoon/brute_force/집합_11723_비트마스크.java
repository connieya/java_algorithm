package com.company.baekjoon.brute_force;

import java.io.*;
import java.util.StringTokenizer;

public class 집합_11723_비트마스크 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int s = 0;
        int num;
        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "add": // num -1 에 해당하는 이진법 자리를 1로 변경
                    num = Integer.parseInt(st.nextToken()) - 1;
                    s = (s | 1 << num);
                    break;
                case "remove": // num -1에 해당하는 이진법 자리를 0으로 변경
                    num = Integer.parseInt(st.nextToken()) - 1;
                    s = s & ~(1 << num);
                    break;
                case "check":
                    num = Integer.parseInt(st.nextToken()) - 1;
                    sb.append((s & 1 << num) == 0 ? 0 : 1).append("\n");
                    break;
                case "toggle":
                    num = Integer.parseInt(st.nextToken()) - 1;
//                    s = (s & 1 << num) == 0 ? s | 1 << num : s & ~(1 << num);
                    s = s ^ 1 << num;
                    break;
                case "all":
//                    s = s | ~(1 << 21);
                    s = ~0;
                    break;
                case "empty":
//                    s =  s & 1 <<21; 코드 개선
                    s = 0;
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}
