package com.company.study2021.week12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BabaIsRabbit_17839 {
    static Set<String> set;
    static ArrayList<String> res;
    static Map<String, List<String>> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        set = new HashSet<>();
        res = new ArrayList<>();
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
        if (map.containsKey("Baba")) {
            List<String> baba = map.get("Baba");
            for (String b : baba) {
                dfs(b);
            }
        }
        Collections.sort(res);
        for (String a : res) {
            System.out.println(a);
        }
    }

    public static void dfs(String str) {
        if (set.contains(str)) return;
        set.add(str);
        res.add(str);

        if (map.containsKey(str)) {
            for (String element : map.get(str)) {
                dfs(element);
            }
        }
    }
}