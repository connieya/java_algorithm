package com.company.study2021.week5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 참외밭_2477 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 참외

        int max = 0;
        int sum = 0;

        st = new StringTokenizer(br.readLine());
        st.nextToken();
        int a = Integer.parseInt(st.nextToken()); //첫번째 변은 마지막 변과 곱해주어야 하므로 따로 처리
        int before = a;

        for (int i = 1; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            int now = Integer.parseInt(st.nextToken());
            max = Math.max(now * before, max); // 최댓값은 인접한 변의 곱 중 하나이다.
            sum += now * before;
            before = now;
        }
        sum += a * before; // 마지막 변과 첫번째 변 곱해줌
        max = Math.max(a * before, max); // 마지막변과 첫번째 변 크기 체크


        int result = (max - (3 * max - sum)) * K;  // 3*max - sum : 빈 부분의 넓이
        System.out.println(result);
    }
}
