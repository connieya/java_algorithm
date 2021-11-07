package com.company.programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 여행경로 {
    static String answer [];
    public static void main(String[] args) {
        String tickets [][] = { {"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        boolean visited[] = new boolean[tickets.length];
        List<String []> answerGroup = new ArrayList<>();
        for (int i = 0;  i  < tickets.length; i++) {
            if (tickets[i][0].equals("ICN") && !visited[i]) {
                answer = new String[tickets.length+1];
                visited[i] = true;
                answer[0] = "ICN";
                dfs(visited,tickets ,tickets[i][1] , 1);
                visited[i] = false;
            }
            answerGroup.add(answer);

        }
        for (String answer[] : answerGroup) {
            System.out.println(Arrays.toString(answer));
        }
    }
    public static void dfs(boolean visited[] , String ticket[][] ,String depart , int index) {
        answer[index] =depart;
        if (index == ticket.length) {
            return;
        }
        for (int i=0; i<ticket.length; i++) {
            if (depart.equals(ticket[i][0]) && !visited[i]) {
                visited[i] = true;
                dfs(visited , ticket , ticket[i][1], index+1);
                visited[i] = false;
            }
        }

    }
}
