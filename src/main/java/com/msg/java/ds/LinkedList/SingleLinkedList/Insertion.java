package com.msg.java.ds.LinkedList.SingleLinkedList;

/*
Given a Linked List, the task is to insert a new node in this given Linked List at the following positions:

At the front of the linked list
After a given node.
At the end of the linked list.
*/
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    public LinkedList(){
        this.head=null;
    }

    public void insertAtTheFront(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfterNode(Node prevNode, int newData){
        if(prevNode == null){
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next= newNode;
    }

    public void insertAtEnd(int newData){

        Node newNode = new Node(newData);

        if(head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    // Display the linked list
    public void displayLinkedList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void deleteLinkedList(){
        head = null;
        displayLinkedList();
    }
}
public class Insertion {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.insertAtTheFront(10);
        linkedList.insertAtEnd(20);
        linkedList.insertAtEnd(30);

        Node givenNode = linkedList.head.next;
        linkedList.insertAfterNode(givenNode, 12);

        linkedList.displayLinkedList();
        linkedList.deleteLinkedList();
    }
}

