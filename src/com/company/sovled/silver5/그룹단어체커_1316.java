package com.company.sovled.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (n-- > 0) {
            String str = br.readLine();
            int alpha[] = new int[26];
            boolean flag = true;
            for (int i = 0; i < str.length() - 1; i++) {
                alpha[str.charAt(i) - 'a']++;
                if (str.charAt(i) != str.charAt(i + 1) && alpha[str.charAt(i+1)-'a'] > 0) {
                    flag = false;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
