package com.company.study.week7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 순열_9742 {
    static char ch[];
    static int count;
    static String value;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input);
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            ch = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                ch[i] = str.charAt(i);
            }
            count = 1;
            value = "No permutation";
            do {
                if (count == num) {
                    StringBuilder sb = new StringBuilder();
                    for (char c : ch) {
                        sb.append(c);
                    }
                    value = sb.toString();
                    break;
                }
                count++;
            }while (next_permutation(ch));
            System.out.println(str + " " + num + " = " + value);

        }
    }

    public static boolean next_permutation(char ch[]) {
        int i = ch.length-1;
        while (i>0 && ch[i-1] > ch[i]) {
            i--;
        }
        if (i==0) {
            return false;
        }

        int j = ch.length -1;
        while (ch[i-1] > ch[j]) {
            j--;
        }
        char temp = ch[j];
        ch[j] = ch[i-1];
        ch[i-1] = temp;

        j = ch.length -1;
        while (i < j) {
            temp = ch[j];
            ch[j] = ch[i];
            ch[i] = temp;
            i++;
            j--;
        }
        return true;
    }
}
