package com.company.study2021.datastructure.linkedlist;

class LinkedListImpl {
    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    public LinkedListImpl() {
        header = new Node();
    }

    void append(int data) {
        Node end = new Node();
        end.data = data;
        Node n = header;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int data) {
        Node n = header;
        while (n.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    // 중복 값 삭제 부분 추가 구현
    void removeDups() {
        Node n = header;
        while (n != null && n.next != null) {
            Node r = n;
            while (r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }

}

public class LinkedListNode {
    public static void main(String[] args) {
        LinkedListImpl li = new LinkedListImpl();
        li.append(1);
        li.append(2);
        li.append(3);
        li.append(4);
        li.append(5);
        li.append(2);
        li.append(4);
        li.retrieve();
        li.removeDups();
        li.retrieve();

    }
}
