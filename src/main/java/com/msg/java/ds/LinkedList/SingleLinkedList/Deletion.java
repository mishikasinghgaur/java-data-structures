package com.msg.java.ds.LinkedList.SingleLinkedList;

import java.util.HashSet;
public class Deletion {
    private Node head;

    public Deletion() {
        this.head = null;
    }

    void deleteFromFront(){
        if(head == null){
            System.out.println("Head is null, please add nodes to the linkedList");
            return;
        }
        else{
            Node temp = head;
            head = head.next;
            temp.next = null;
        }
    }

    void deleteFromEnd(){
        if(head == null){
            System.out.println("Head is null, please add nodes to the linkedList");
            return;
        }
        else if (head.next == null) {
            head = null;
        } else{
            Node prev = null;
            Node current = head;
            while(current.next != null){
                prev = current;
                current = current.next;
            }

            prev.next = null;
        }
    }

    void deleteNthNode(int data){
        if(head == null){
            System.out.println("Head is null, please add nodes to the linkedList");
            return;
        }
        else{
            Node prev = head;
            Node current = head;
            while(current.data != data){
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
        }
    }

    void insertInTheBeginning(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            n.next = head;
            head = n;

        }
    }

    void insertAtTheEnd(int data){
        Node n = new Node(data);
        Node current = head;
        while(current.next!=null){
            current= current.next;
        }
        current.next = n;
        n.next = null;
    }

    void removeDuplicates(Node head)
    {
        Node current = head;
        HashSet<Integer> hm = new HashSet<>();
        while(current != null){
            if(hm.contains(current.data))
            {
                current = current.next;
            }
            if(current == null){
                break;
            }
            else{
                hm.add(current.data);
                current = current.next;
            }
        }
    }

    Node removeDuplicatesInSortedLL(Node head)
    {
        Node current = head;
        Node prev = null;
        boolean flag;
        while(current != null){
            flag = false;
            if(current.next != null) {
                if (current.data == current.next.data) {
                    prev.next = current.next;
                    flag = true;
                }
                if (flag) {
                    current = current.next;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
            else {
                break;
            }
        }
        return current;
    }

    public void displayLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String [] args){
        Deletion list = new Deletion();
        list.insertInTheBeginning(10);
        list.insertAtTheEnd(20);
        list.insertAtTheEnd(30);
        list.insertAtTheEnd(40);
        list.insertAtTheEnd(40);
        list.insertAtTheEnd(60);
        list.insertAtTheEnd(60);
        list.insertAtTheEnd(60);

//        list.deleteFromFront();
//        list.deleteFromEnd();
//        list.deleteNthNode(20);
//        list.deleteNthNode(20);
        Node n = list.removeDuplicatesInSortedLL(list.head);

        list.displayLinkedList();
    }
}
