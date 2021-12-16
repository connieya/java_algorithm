package com.company.sovled.gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class AC_5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (n-- > 0) {
            String p = br.readLine();
            boolean isReverse = false;
            boolean isError = false;
            int size = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            Deque<Integer> deque = new ArrayDeque<>();
            int res = 0;
            for (char ch : arr.toCharArray()) {
                if (Character.isDigit(ch)) {
                    res = res * 10 + ch - '0';
                } else {
                    if (res != 0) {
                        deque.offerLast(res);
                        res = 0;
                    }
                }
            }
            for (char ch : p.toCharArray()) {
                if (ch == 'R') {
                    isReverse = !isReverse;
                } else {
                    if (deque.isEmpty()) {
                        sb.append("error\n");
                        isError = true;
                        break;
                    } else if (isReverse) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }
            if (!isError) {
                sb.append("[");
                while (deque.isEmpty()) {
                    if (isReverse) {
                        sb.append(deque.pollLast());
                    } else {
                        sb.append(deque.pollFirst());
                    }
                    if (deque.size() != 1) {
                        sb.append(",");
                    }
                }
                sb.append("]").append("\n");
            }
        }
        System.out.println(sb);
    }


}
