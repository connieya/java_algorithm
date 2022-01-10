package com.company.programmers;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Node implements Comparable<Node> {

    @Override
    public int compareTo(Node o) {
        return 0;
    }
}

public class Main  {
    static String str[] = {"kakao", "adsto", "ddddo", "lollo", "sepso", "ziroo", "karoo", "miroo","sallo", "seddo"};
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String str[] = {"AC","AC","AC","AC","AC","AC","DD","QWE"};
        for (String s: str){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for (String s : map.keySet()) {
            System.out.println(s + " " + map.get(s));
        }

//        Arrays.sort(str);
//        for (String s : str) {
//            System.out.print(s + " ");
//        }
//        System.out.println();
//        System.out.println(lower_bound("aaaao",0,str.length));
//        System.out.println(upper_bound("zzzzo",0,str.length));

    }

    public static int lower_bound(String target, int lt, int rt) {
        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (str[mid].compareTo(target) >= 0) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        return rt;
    }

    public static int upper_bound(String target, int lt, int rt) {
        while (lt < rt) {
            int mid = (lt + rt) / 2;
            if (str[mid].compareTo(target) > 0) {
                rt = mid;
            } else {
                lt = mid + 1;
            }
        }
        return rt;
    }
}
