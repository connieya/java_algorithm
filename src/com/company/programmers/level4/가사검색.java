package com.company.programmers.level4;
import java.util.*;
class Solution {
    public int[] solution(String[] words, String[] queries) {
        int answer[] = new int[queries.length];
        Arrays.sort(words);
        List<ArrayList<String>> W = new ArrayList<>();
        List<ArrayList<String>> R = new ArrayList<>();
        for(int i=0; i<=10000; i++){
            W.add(new ArrayList<>());
            R.add(new ArrayList<>());
        }
        for(String word : words) {
            int len = word.length();
            String rev_word = new StringBuilder(word).reverse().toString();
            W.get(len).add(word);
            R.get(len).add(rev_word);
        }
        for(int i=1; i<=10000; i++) {
            Collections.sort(W.get(i));
            Collections.sort(R.get(i));
        }

        for(int i=0; i<queries.length; i++){
            int res = 0;
            String query = queries[i];
            String rev_query = new StringBuilder(query).reverse().toString();
            int len = query.length();
            ArrayList<String> arr = W.get(len);
            ArrayList<String> rev_arr = R.get(len);
            if(query.charAt(0) != '?'){
                int l = lower_bound(arr,query.replaceAll("\\?","a"),0,arr.size());
                int u = upper_bound(arr,query.replaceAll("\\?","z"),0,arr.size());
                res = u -l;
            }else {
                int l = lower_bound(rev_arr, rev_query.replaceAll("\\?","a"), 0, rev_arr.size());
                int u = upper_bound(rev_arr, rev_query.replaceAll("\\?","z"), 0, rev_arr.size());
                res = u -l;
            }
            answer[i] = res;
        }
        return answer;
    }
    public int lower_bound(ArrayList<String> arr, String str , int start ,int end) {
        while(start < end) {
            int mid = (start +end) /2;
            if(arr.get(mid).compareTo(str) >= 0){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return end;
    }

    public int upper_bound(ArrayList<String> arr, String str , int start ,int end) {
        while(start < end) {
            int mid = (start +end) /2;
            if(arr.get(mid).compareTo(str) > 0){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return end;
    }
}