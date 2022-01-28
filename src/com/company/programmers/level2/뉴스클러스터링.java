package com.company.programmers.level2;

import java.util.*;

public class 뉴스클러스터링 {
    public static int lower_bound(List<String> list, int start, int end, String target) {
        while (start < end) {
            int mid = (start+end) /2;
            if (list.get(mid).compareTo(target) >= 0){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return end;
    }
    public static int upper_bound(List<String> list, int start, int end, String target) {
        while (start < end) {
            int mid = (start+end) /2;
            if (list.get(mid).compareTo(target) > 0){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        String str1 = "aabbc";
        String str2 = "abbde";
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        List<String> a = toSub(str1);
        List<String> b = toSub(str2);
        Collections.sort(a);
        Collections.sort(b);
        System.out.println(a);
        System.out.println(b);
        int intersection = 0; // 교집합
        int union = 0; // 합집합
        int len = a.size();
        Set<String> set = new HashSet<>();
        String prev = "&&";
        for (int i=0; i<len; i++){
            String str = a.get(i);
            set.add(str);
            if (prev.equals(str)) {
                continue;
            }
            int a_cnt = upper_bound(b,0,b.size(),str) - lower_bound(b,0,b.size(),str);
            int b_cnt = upper_bound(a,0,a.size(),str) - lower_bound(a,0,a.size(),str);
            int tmp = a_cnt;
            a_cnt = Math.min(a_cnt,b_cnt);
            b_cnt = Math.max(tmp,b_cnt);
            intersection += a_cnt;
            union += b_cnt;
            prev = str;
        }
        for (int i=0; i<b.size(); i++) {
            if (set.add(b.get(i))) {
                union++;
            }
        }
        System.out.println(intersection+" "+ union);
    }

    public static List<String> toSub(String str) {
        int len = str.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < len - 1; i++) {
            String sub = str.substring(i, i + 2);
            if (isValid(sub)) {
                list.add(sub);
            }
        }
        return list;
    }

    public static boolean isValid(String sub) {
        return Character.isAlphabetic(sub.charAt(0)) && Character.isAlphabetic(sub.charAt(1));
    }
}
