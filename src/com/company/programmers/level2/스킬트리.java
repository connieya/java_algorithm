package com.company.programmers.level2;

public class 스킬트리 {
    public static void main(String[] args) {
        String skill = "CBD";
        String skill_trees[] = {"BACDE","CBADF","AECB","BDA"};
        int  answer =0;
        for (String str : skill_trees) {
            StringBuilder sb = new StringBuilder();
            for (char c: str.toCharArray()) {
                if (skill.contains(String.valueOf(c))){
                    sb.append(c);
                }
            }
            if (skill.indexOf(sb.toString())== 0){
                answer++;
            }
        }
        System.out.println(answer);
    }

}
