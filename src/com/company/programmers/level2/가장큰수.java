package com.company.programmers.level2;


import java.util.Arrays;
import java.util.Comparator;

public class 가장큰수 {
    public static void main(String[] args) {
        int numbers[] = {0, 0, 0, 0, 0};
        String result[] = new String[numbers.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        if (result[0]=="0"){
            System.out.println("0");
        }else{

            StringBuilder sb = new StringBuilder();
            for (String s : result){
                sb.append(s);
            }
            System.out.println(sb);
        }
    }
}
