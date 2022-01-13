package com.company.sovled.silver3;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 걸그룹마스터준석이_16165 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String groupNum[] = new String[N];
        Map<String ,Integer> memberKey = new HashMap<>();
        Map<String ,String []> groupKey = new HashMap<>();
        for (int i=0; i<N; i++) {
            String groupName = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());
            groupNum[i] = groupName;
            String memberList[] = new String[memberCount];
            for (int j=0; j<memberCount; j++){
                String memberName = br.readLine();
                memberKey.put(memberName,i);
                memberList[j] = memberName;
            }
            Arrays.sort(memberList);
            groupKey.put(groupName,memberList);
        }
        while (M-- > 0){
            String str = br.readLine();
            int num = Integer.parseInt(br.readLine());
            if (num == 1){
                int idx = memberKey.get(str);
                bw.write(groupNum[idx]+"\n");
            }else {
                String[] strings = groupKey.get(str);
                for (String s : strings){
                    bw.write(s+"\n");
                }
            }
        }
        bw.flush();
    }
}
