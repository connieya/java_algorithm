package com.company.study.week7;

import java.io.*;

public class 팬그램_10384 {
    static final String NOT_PANGRAM = "Not a pangram";
    static final String PANGRAM = "Pangram!";
    static final String DOUBLE_PANGRAM = "Double pangram!!";
    static final String TRIPLE_PANGRAM = "Triple pangram!!!";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int start = 1;
        while (t-- > 0) {
            int alpha[] = new int[26];
            String input = br.readLine().toLowerCase();
            for (char character : input.toCharArray()) {
                if (Character.isAlphabetic(character)) {
                    alpha[character - 'a']++;
                }
            }

            int check []  = new int[3];
            for (int a : alpha) {
                if (a == 0) {
                    check[0]++;
                    continue;
                }
                if (a == 1) {
                    check[1]++;
                    continue;
                }

                if (a == 2) {
                    check[2]++;
                    continue;
                }
            }
            if (check[0] >=1) {
                bw.write("Case " + start++ + ": " + NOT_PANGRAM);
                bw.write("\n");
                continue;
            }

            if (check[1] >= 1) {
                bw.write("Case " + start++ + ": " + PANGRAM);
                bw.write("\n");
                continue;
            }

            if (check[2] >= 1) {
                bw.write("Case " + start++ + ": " + DOUBLE_PANGRAM);
                bw.write("\n");
                continue;

            } else {
                bw.write("Case " + start++ + ": " + TRIPLE_PANGRAM);
                bw.write("\n");
            }

        }
        br.close();
        bw.close();
    }
}
