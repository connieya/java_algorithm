package com.company.kakao;

import java.util.*;

public class 오픈채팅방 {
    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        Map<String, String> map = new HashMap<>();
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < record.length; i++) {
            StringTokenizer st = new StringTokenizer(record[i]);
            String msg = st.nextToken();
            if (msg.equals("Leave")) {

            } else {
                String id = st.nextToken();
                String nickname = st.nextToken();
                map.put(id, nickname);
            }
        }
        for (int i = 0; i < record.length; i++) {
            StringTokenizer st = new StringTokenizer(record[i]);
            String msg = st.nextToken();
            if (msg.equals("Enter")) {
                String id = st.nextToken();
                String message = map.get(id) + "님이 들어왔습니다.";
                answer.add(message);

            } else if (msg.equals("Leave")) {
                String id = st.nextToken();
                String message = map.get(id) + "님이 나갔습니다.";
                answer.add(message);
            }
        }
        System.out.println(answer);
    }
}
