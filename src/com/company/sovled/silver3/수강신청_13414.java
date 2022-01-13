package com.company.sovled.silver3;

import java.io.*;
import java.util.*;

public class 수강신청_13414 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        Set<String > set = new HashSet<>();
        Stack<String > stack = new Stack<>();
        while (L-- > 0){
            String input =br.readLine();
            if (set.add(input)){
                stack.add(input);
            }else{

            }
        }
    }
}
