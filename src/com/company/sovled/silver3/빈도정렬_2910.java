package com.company.sovled.silver3;

import java.io.*;
import java.util.*;

public class 빈도정렬_2910 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        HashMap<Integer,Integer> map = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            int value = Integer.parseInt(st.nextToken());
            map.put(value,map.getOrDefault(value,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o2)-map.get(o1);
            }
        });
        for (int i : list) {
            int element = map.getOrDefault(i, 0);
            for (int j=0; j<element; j++){
                bw.write(i+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
