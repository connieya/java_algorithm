package com.company.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grap_1 {
    public static void main(String[] args) {
        String infos[] = {"kim password", "lee abc"};
        String actions[] = {"ADD 30",
                "LOGIN kim abc",
                "LOGIN lee password",
                "LOGIN kim password",
                "LOGIN kim password",
                "LOGIN lee abc",
                "ADD 30",
                "ORDER",
                "ORDER",
                "ADD 40",
                "ADD 50"};
        boolean isLogin = false;
        boolean isContainFood = false;
        Map<String, String> map = new HashMap<>();
        for (String info : infos) {
            map.put(info.split(" ")[0], info.split(" ")[1]);
        }
        List<Boolean> list = new ArrayList<>();
        for (String action : actions) {
            if (action.startsWith("LOGIN")) {
                String[] actionSplit = action.split(" ");
                String id = actionSplit[1];
                String pw = actionSplit[2];
                if (map.get(id).equals(pw) && !isLogin) {
                    list.add(true);
                    isLogin = true;
                } else {
                    list.add(false);
                }

            }
            if (action.startsWith("ADD")) {
                if (isLogin) {
                    isContainFood = true;
                    list.add(true);
                } else {
                    list.add(false);
                }

            }
            if (action.equals("ORDER")) {
                if (isLogin && isContainFood) {
                    list.add(true);
                    isContainFood = false;
                } else {
                    list.add(false);
                }

            }
        }
        boolean[] answer = new boolean[list.size()];
        for (int i=0; i<list.size(); i++) {
            answer[i]= list.get(i);
        }

        for (boolean a: answer){
            System.out.println(a);
        }
    }
}
