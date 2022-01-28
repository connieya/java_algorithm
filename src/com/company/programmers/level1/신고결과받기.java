package com.company.programmers.level1;

import java.util.*;

public class 신고결과받기 {
    public static void main(String[] args) {
        String id_list[] = {"con", "ryan"};
        String report[] = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int len = id_list.length;
        int k = 2;
        Set<String> report_list[] = new HashSet[len];
        Map<String, Integer> report_index = new HashMap<>();
        Set<String> report_count[] = new Set[len];
        int []answer = new int[len];
        for (int i = 0; i < len; i++) {
            report_index.put(id_list[i], i);
            report_list[i] = new HashSet<>();
            report_count[i] = new HashSet<>();
        }
        for (String r : report) {
            StringTokenizer st = new StringTokenizer(r, " ");
            String a = st.nextToken();
            String b = st.nextToken();
            int idx = report_index.get(a);
            report_list[idx].add(b);
            report_count[report_index.get(b)].add(a);
        }

        for (int i=0; i<len; i++){
            Set<String> reports = report_list[i];
            int cnt = 0;
            for (String re : reports){
                if (report_count[report_index.get(re)].size() >= k){
                    cnt++;
                }
            }
            answer[i] =cnt;

        }
        System.out.println(Arrays.toString(answer));
    }
}
