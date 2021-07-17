package com.company.programmers.level1;

public class 문자열을정수로바꾸기 {
    static int solution(String str){
        int answer =0;
        boolean flag = true;
        for(char ch : str.toCharArray()){
            if(ch=='-'){
                flag = false;
            }else{
                int num = ch-48;
                answer = answer*10 +num;
            }
        }
        return (flag==true) ? answer : -1*answer ;
    }
    public static void main(String[] args) {
        String str ="-1234";
        solution(str);
    }
}
