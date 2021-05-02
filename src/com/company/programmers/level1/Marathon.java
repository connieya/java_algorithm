package com.company.programmers.level1;

import java.util.Scanner;

public class Marathon {

    public String solution(String participant[], String completion[]) {

        String answer = "";

        for (int i = 0; i < participant.length; i++) {
            boolean flag = true;
            for (int j = 0; j < completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    flag = false;
                    completion[j] = "";
                }
            }

            if (flag) {
                answer = participant[i];
            }


        }


        return answer;
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//
//        String participant[] = new String[num1];
//        String completion[] = new String[num1-1];
        String participant[] = new String[]{"mislav", "stanko", "mislav", "ana"};
        String completion[] = new String[]{"stanko", "ana", "mislav"};

        System.out.println(participant.length);
        System.out.println(completion.length);
        System.out.println(participant[3].equals(completion[1]));

        Marathon M = new Marathon();
        System.out.println(M.solution(participant, completion));
    }
}
