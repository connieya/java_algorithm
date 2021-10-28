package com.company.kakao;

import java.util.ArrayList;
import java.util.List;

public class 압축 {
    public static void main(String[] args) {
        String msg = "KAKAO";
        ArrayList<String> dictionary = new ArrayList<>();
        for (int i = 65; i <= 90; i++) {
            dictionary.add((char) i + "");
        }
        List<Integer> answer = new ArrayList<>();
        char[] charArray = msg.toCharArray();
        String w = "";
        String c = "";
        int index = 0;
        for (int i = 0; i < charArray.length; i++) {
            w += charArray[i];
            if (i + 1 < charArray.length) {
                c += charArray[i + 1];
                String wc = w + c;
                if (dictionary.contains(wc)) {
                    answer.add(dictionary.indexOf(wc)+1);
                    continue;
                } else {
                    dictionary.add(wc);
                    answer.add(dictionary.indexOf(w)+1);
                }

            }else {

            }

        }
        System.out.println(answer);
    }
}
