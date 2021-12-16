package com.company.study.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BabaisRabbit_17839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String ,String > map = new HashMap<>();
        while (n-- >0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            st.nextToken();
            String b= st.nextToken();
            map.put(a,b);
        }
        String str = map.getOrDefault("Baba"," ");
        List<String> list = new ArrayList<>();
        while (!str.equals(" ")){
            list.add(str);
            str = map.getOrDefault(str," ");
        }
        Collections.sort(list);
        for (String answer : list){
            System.out.println(answer);
        }
    }
}
