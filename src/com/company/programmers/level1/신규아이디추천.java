package com.company.programmers.level1;

public class 신규아이디추천 {
    public static void main(String[] args) {
        String new_id = "abcdefghijklmn.p";
        String answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        answer = answer.replaceAll("[.][2,]", ".");
        answer = answer.replaceAll("^[.]|[.]$", "");

        if (answer.isEmpty()) {
            answer += "a";
        }
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }
        if (answer.length() <= 2) {
            for (int i = answer.length(); i < 3; i++) {
                answer += answer.charAt(answer.length()-1);
            }
        }


    }
}
