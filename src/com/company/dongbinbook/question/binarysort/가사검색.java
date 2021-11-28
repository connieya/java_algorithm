package com.company.dongbinbook.question.binarysort;

import java.time.format.SignStyle;
import java.util.ArrayList;
import java.util.Collections;

public class 가사검색 {
    // 모든 단어를 길이마다 나누어서 저장하기 위한 리스트
    public static ArrayList<ArrayList<String>> wordsList = new ArrayList<>();
    // 모든 단어를 길이마다 나눈뒤 단어를 뒤집어서 저장하기 위한 리스트
    public static ArrayList<ArrayList<String>> reverserWordsList = new ArrayList<>();

    public static void main(String[] args) {
        String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
        String queries[] = {"fro??", "????o", "fr???", "fro???", "pro?"};
        int answer[] = new int[queries.length];
        // 각 단어의 길이가 1이상 10_000 이하 이므로
        for (int i = 0; i < 10_001; i++) {
            wordsList.add(new ArrayList<>());
            reverserWordsList.add(new ArrayList<>());
        }
        // 모든 단어를 접미사 와일드카드 배열, 접두사 와일드카드 배열에 삽입
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            wordsList.get(word.length()).add(word);
            word = new StringBuilder(word).reverse().toString();
            reverserWordsList.get(word.length()).add(word);
        }
        // 이진 탐색을 수행하기 위해 각 단어 리스트 정렬 수행
        for (int i = 1; i < 10_001; i++) {
            Collections.sort(wordsList.get(i));
            Collections.sort(reverserWordsList.get(i));
        }
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            int res = 0;
            if (query.charAt(0) == '?') {

                continue;
            }

        }


    }

    public static int lowerBound(ArrayList<String> arr, String target, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            // arr[mid]가 target 보다 사전순으로 같거나 뒤에 있다면
            if (arr.get(mid).compareTo(target)>=0){
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return end;
    }

    public static int upperBound(ArrayList<String> arr, String target ,int start , int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            // arr[mid]가 tartget 보다 사전순으로 뒤에 있다면
            if (arr.get(mid).compareTo(target) > 0) {
                end = mid;
            }else {
                start = mid +1;
            }
        }
        return end;
    }
}
