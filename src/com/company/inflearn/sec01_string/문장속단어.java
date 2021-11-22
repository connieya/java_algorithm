package com.company.inflearn.sec01_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 문장속단어 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = -1;
        String answer = "";
        while (st.hasMoreElements()){
            String str = st.nextToken();
            if (str.length() > max){
                max = str.length();
                answer = str;
            }
        }
        System.out.println(answer);
    }
}
