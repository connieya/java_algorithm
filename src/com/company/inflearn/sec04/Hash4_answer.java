package com.company.inflearn.sec04;

import java.util.HashMap;
import java.util.Scanner;

public class Hash4_answer {

    public int solution(String a, String b){
        int count =0;
        HashMap<Character,Integer> am = new HashMap<>();
        HashMap<Character,Integer> bm = new HashMap<>();
        for (char x : b.toCharArray()){
            bm.put(x, bm.getOrDefault(x,0)+1);
        }
        int L = b.length()-1;
        for (int i=0; i<L ; i++){
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i) ,0)+1);
        }



        int lt =0;
        for (int rt = L; rt < a.length(); rt++){
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0)+1);
            if (am.equals(bm)) count++;
            am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
            if (am.get(a.charAt(lt)) ==0) am.remove(a.charAt(lt));

            lt++;
        }
        return count;
    }

    public static void main(String[] args) {


        Hash4_answer H = new Hash4_answer();

        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();

        String str2 = sc.next();

        System.out.println(H.solution(str1,str2));
    }
}
