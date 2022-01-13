package com.company.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class 수식최대화 {
    static final char OP[] = {'*', '-', '+'};

    public static void main(String[] args) {
        String expression = "50*6-3*2";
        String num = "";
        List<Long> numbers = new ArrayList<>();
        List<Character> operations = new ArrayList<>();
        long digit = 0;
        for (char ch : expression.toCharArray()) {
            if (!Character.isDigit(ch)) {
                digit = Long.parseLong(num);
                numbers.add(digit);
                operations.add(ch);
                num = "";
            } else {
                num += ch;
            }
        }
        numbers.add(Long.parseLong(num));
        int arr[] = {0, 1, 2};
        do {
            List<Long> tmp_num = new ArrayList<>(numbers);
            List<Character> tmp_op = new ArrayList<>(operations);
            for (int i=0; i<3; i++){
                char cur = OP[arr[i]];
                for (int j=0; j<tmp_op.size(); j++){
                    if (tmp_op.get(j) == cur){
                        long result = calc(cur, tmp_num.get(j),tmp_num.get(j+1));
                        tmp_num.remove(j+1);
                        tmp_num.set(j,result);
                        tmp_op.remove(j);
                        j--;
                    }
                }
            }
            System.out.println(Math.abs(tmp_num.get(0)));
            System.out.println("-------------");
        }while (next_permutation(arr));
    }

    public static long calc(char op , long n1 ,long n2){
        if (op == '*'){
           return n1 * n2;
        }else if (op == '+'){
            return n1+n2;
        }
        return n1-n2;
    }

    public static boolean next_permutation(int arr[]) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] > arr[i]) {
            i--;
        }
        if (i <= 0) return false;
        int j = arr.length - 1;
        while (arr[i - 1] > arr[j]) {
            j--;
        }
        int tmp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = tmp;

        j = arr.length - 1;
        while (i < j) {
            tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
            i++;
            j--;
        }
        return true;

    }

}
