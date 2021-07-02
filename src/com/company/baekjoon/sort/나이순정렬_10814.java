package com.company.baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
class Member implements Comparable<Member>{
    int age;
    String name;
    public Member(int age , String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public int compareTo(Member o) {
        return age -o.age;
    }
}
public class 나이순정렬_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Member[] members = new Member[N];
       for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members[i] = new Member(age,name);
        }
        Arrays.sort(members);
        StringBuilder sb = new StringBuilder();
        for (Member member : members){
            sb.append(member.age+" "+member.name+"\n");
        }
        System.out.println(sb);


    }
}
