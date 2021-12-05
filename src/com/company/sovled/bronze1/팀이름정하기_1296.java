package com.company.sovled.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Choice implements Comparable<Choice> {
    String team;
    int percentage;

    public Choice(String team, int percentage) {
        this.team = team;
        this.percentage = percentage;
    }

    @Override
    public int compareTo(Choice o) {
        if (this.percentage == o.percentage){
            return this.team.compareTo(o.team);
        }
        return o.percentage-this.percentage;
    }
}

public class 팀이름정하기_1296 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int love[] = new int[4]; // L : 0 , O : 1 ,V :2 , E :3
        String name = br.readLine();
        List<Choice> choices = new ArrayList<>();
        countLoveCharacter(love, name);
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String team = br.readLine();
            int love2[] = new int[4];
            countLoveCharacter(love2, team);
            int percentage = 1;
            for (int i = 0; i < 3; i++) {
                for (int j = i + 1; j < 4; j++) {
                    percentage *= (love[i]+love2[i] + love[j]+love2[j]);
                }
            }
            percentage %= 100;
            choices.add(new Choice(team,percentage));
        }
        Collections.sort(choices);
        System.out.println(choices.get(0).team);
    }

    private static void countLoveCharacter(int[] love, String name) {
        for (char ch : name.toCharArray()) {
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
