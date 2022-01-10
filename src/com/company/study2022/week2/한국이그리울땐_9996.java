package com.company.study2022.week2;

import java.io.*;

public class 한국이그리울땐_9996 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int index = input.indexOf("*");
        String first = input.substring(0, index);
        String second = input.substring(index+1);
        while (n-- > 0) {
            String answer = "NE";
            String str = br.readLine();
            if (first.equals(str.substring(0,index)) && second.equals(str.substring(str.length()-second.length()))){
                answer = "DA";
            }
            bw.write(answer+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
