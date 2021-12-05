package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 팀이름정하기_1296_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String YeonDoo = br.readLine();
        int[] love = new int[4];
        countLoveCharacter(YeonDoo, love);
        int n = Integer.parseInt(br.readLine());
        int max = -1;
        String  answer = " ";
        while (n-- > 0) {
            String teamName = br.readLine();
            int love2[] = new int[4];
            countLoveCharacter(teamName, love2);
            love2[0] += love[0];
            love2[1] += love[1];
            love2[2] += love[2];
            love2[3] += love[3];
            int percentage = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    percentage *= (love2[i] + love2[j]);
                }
            }
            percentage %= 100;
            if(percentage > max){
                max = percentage;
                answer = teamName;
            }else if (percentage == max){
                if (answer.compareTo(teamName) > 0){
                    answer = teamName;
                }
            }
        }
        System.out.println(answer);
    }

    private static void countLoveCharacter(String YeonDoo, int[] love) {
        for (char ch : YeonDoo.toCharArray()) {
            if (ch == 'L') {
                love[0]++;
                continue;
            }
            if (ch == 'O') {
                love[1]++;
                continue;
            }
            if (ch == 'V') {
                love[2]++;
                continue;
            }
            if (ch == 'E') {
                love[3]++;
                continue;
            }
        }
    }
}
