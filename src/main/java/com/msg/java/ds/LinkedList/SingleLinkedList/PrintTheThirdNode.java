package com.msg.java.ds.LinkedList.SingleLinkedList;


//Assume that the size of the LinkedList is more than 4
public class PrintTheThirdNode {

    // Head of list
    Node head;

    PrintTheThirdNode(){
        this.head= null;
    }

    // Single Linked list Node
    class Node {
        int data;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) { data = d; }
    }

    void findTheThirdNode(){
        Node current = head;
        int i =0;
        while(i<3){
            current = current.next;
            i++;
        }
        System.out.println("The current node is:" + current.data);
        System.out.println(("The current - 3 node is:" + head.data));
    }

    void insertInTheBeginning(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        else{
            Node temp = n;
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

    void display(){
        Node current = head;
        while(current.next!=null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String [] args){
        PrintTheThirdNode list = new PrintTheThirdNode();

        //Adding elemenst to the LinkedList
        list.insertInTheBeginning(10);
        list.insertAtTheEnd(20);
        list.insertAtTheEnd(30);
        list.insertAtTheEnd(40);
        list.insertAtTheEnd(50);
        list.insertAtTheEnd(60);

        list.findTheThirdNode();
        list.display();
    }
}
