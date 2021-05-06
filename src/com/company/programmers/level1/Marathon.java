package com.company.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Marathon {

    public String solution(String participant[], String completion[]) {

        String answer ="";

        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for ( i =0; i< completion.length; i++){
            if (!participant[i].equals(completion[i])){
                answer = participant[i];
                break;
            }
        }
      return participant[i];
    }

    public static void main(String[] args) {

        String participant[] = new String[]{"mislav", "stanko", "mislav", "ana"};
        String completion[] = new String[]{"stanko", "ana", "mislav"};



        Marathon M = new Marathon();
        System.out.println(M.solution(participant, completion));
    }
}
