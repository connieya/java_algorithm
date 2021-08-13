package com.company.programmers.level2;

public class 스킬트리_1 {
    public static void main(String[] args) {
        String skill = "CBD";
        String skill_trees[] = {"BACDE","CBADF","AECB","BDA"};
        int answer =0;
        for (String str : skill_trees){
            str = str.replaceAll("[^"+skill+"]","");
            System.out.println(str);
            System.out.println(skill.indexOf(str));
            if (skill.indexOf(str)==0){
                answer++;
            }
        }

        System.out.println(answer);
    }

}
