package com.company.programmers.level2;

import java.util.*;

public class 메뉴리뉴얼 {
    static Map<String, Integer> map = new HashMap<>();
    static char ch[] = new char[11];

    public static void main(String[] args) {
        String orders[] = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int course[] = {2, 3, 4};
        List<String > answer = new ArrayList<>();
        for (int count : course) {
            map = new HashMap<>();
            int max = -1;
            List<String> list = new ArrayList<>();
            for (String order : orders) {
                if (count > order.length()) continue;
                dfs(0, 0, count, order);
            }
            for (String s : map.keySet()){
                int ans = map.get(s);
                if (ans >= 2 && ans > max) {
                    max = ans;
                    list.clear();
                    list.add(s);
                }else if (ans == max){
                    list.add(s);
                }
            }
            for (String s : list){
                answer.add(s);
            }
        }
        Collections.sort(answer);
        for (String a : answer){
            System.out.print(a+" ");
        }
    }

    public static void dfs(int L, int start, int count, String str) {
        if (L == count) {
            String s = "";
            for (int i = 0; i < count; i++) {
                s += ch[i];
            }
//            System.out.println(s);
            map.put(s, map.getOrDefault(s, 0) + 1);
            return;
        }
        for (int i = start; i < str.length(); i++) {
            ch[L] = str.charAt(i);
            dfs(L + 1, i + 1, count, str);
        }

    }
}
