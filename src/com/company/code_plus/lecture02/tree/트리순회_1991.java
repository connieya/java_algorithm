package com.company.code_plus.lecture02.tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    int left , right;
    Node(int left , int right){
        this.left =left;
        this.right =right;
    }
}

public class 트리순회_1991 {
    static void preoreder(Node[] a , int x){
        if (x ==-1) return;
        System.out.print((char)(x+'A'));
        preoreder(a,a[x].left);
        preoreder(a,a[x].right);
    }
    static void inorder(Node[]a, int x){
        if (x == -1) return;
        inorder(a, a[x].left);
        System.out.print((char)(x+'A'));
        inorder(a,a[x].right);
    }
    static void postorder(Node[]a , int x){
        if (x==-1) return;
        postorder(a, a[x].left);
        postorder(a, a[x].right);
        System.out.print((char)(x+'A'));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Node[] a = new Node[26];
        while (n-- > 0){
            String str = br.readLine();
            StringTokenizer stringTokenizer = new StringTokenizer(str);
            int p = stringTokenizer.nextToken().charAt(0) -'A';
            char l = stringTokenizer.nextToken().charAt(0);
            char r = stringTokenizer.nextToken().charAt(0);
            int left =-1;
            int right =-1;
            if (l != '.'){
                left = l-'A';
            }
            if (r != '.'){
                right = r-'A';
            }
            a[p] = new Node(left,right);
        }
        preoreder(a,0);
        System.out.println();
        inorder(a,0);
        System.out.println();
        postorder(a,0);
        System.out.println();

    }
}
