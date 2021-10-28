package com.company.kakao;

import java.util.Stack;

public class 괄호변환 {
    static int pos = 0;
    static String solution(String p){
      if (isValid(p)){
          return p;
      }
      return p;
    }

    public static void main(String[] args) {
        String p = "()))((()";
        System.out.println(solution(p));
    }

    public static boolean isValid(String p) {
        Stack<Character> stack = new Stack<>();
        int left = 0, right = 0;
        boolean ret = true;
        char[] chars = p.toCharArray();
        for (int i = 0; i<chars.length; i++) {
            if (chars[i] == '(') {
                left++;
                stack.push(chars[i]);
            } else {
                right++;
                if (stack.isEmpty()) {
                    ret = false;
                } else {
                    stack.pop();
                }
            }
            if (left == right) {
                pos = i;
            }
        }
        return ret;
    }
}
