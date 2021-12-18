package com.company.study.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BabaisRabbit_17839 {
    static Set<String> set;
    static Map<String, List<String>> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        map = new HashMap<>();
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            st.nextToken();
            String b = st.nextToken();
            if (map.containsKey(a)) {
                map.get(a).add(b);
            } else {
                List<String> list = new ArrayList<>();
                list.add(b);
                map.put(a, list);
            }
        }
        set = new HashSet<>();
        dfs("Baba");
        List<String> ans = new ArrayList<>(set);
        Collections.sort(ans);
        for (String answer : ans) {
            System.out.println(answer);
        }


    }

    public static void dfs(String s) {
        if (s == null) {
            return;
        }

        for (String element : map.getOrDefault(s,new ArrayList<>())) {
            set.add(element);
            dfs(element);
        }
    }
}
