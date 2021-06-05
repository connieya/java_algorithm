package com.company.code_plus.lecture02.brute_recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_14889 {
    static int[][] s;
    static int n;
    static int go(int index , ArrayList<Integer> start_team, ArrayList<Integer> link_team){
        if (index == n){
            if (start_team.size() != n/2) return -1;
            if (link_team.size() != n/2) return -1;
            int t1 = 0;
            int t2 = 0;
            for (int i=0; i<n/2; i++){
                for (int j=0; j<n/2; j++){
                    if (i==j)continue;
                    t1 += s[start_team.get(i)][start_team.get(j)];
                    t2 += s[link_team.get(i)][link_team.get(j)];
                }
            }
            int diff = Math.abs(t1-t2);
            return diff;
        }
        int ans = -1;
        start_team.add(index);
        int t1 = go(index+1 , start_team, link_team);
        if (ans == -1 || (t1 != -1 && ans >t1)){
            ans = t1;
        }
        start_team.remove(start_team.size()-1);
        link_team.add(index);
        int t2 = go(index+1 ,start_team,link_team);
        if (ans == -1 || (t2!= -1 && ans > t2)){
            ans = t2;
        }
        link_team.remove(link_team.size()-1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         s = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                s[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> start_team = new ArrayList<>();
        ArrayList<Integer> link_team = new ArrayList<>();
        System.out.println(go(0,start_team,link_team));
    }
}
