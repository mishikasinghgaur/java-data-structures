package com.msg.java.ds.Queue;

public class BasicOperations {

    int front, rear, size;
    int[] a;
    int capacity;

    BasicOperations(int n){
        this.capacity = n;
        rear = capacity -1;
        a = new int[n];
    }

    boolean isEmpty(){
        return size == 0;
    }

    boolean isFull(){
        return size == capacity - 1;
    }

    void enqueue(int x){
        if(size > capacity){
            System.out.println("Queue is full");
        }
        else{
           a[++size] = x;
        }
    }

    int dequeue(){
        if(isEmpty())
            return 0;
        else{
            int x = a[front];
            front = front + 1;
            size = size -1;
            return x;
        }
    }

    void display(){
        for(int i = front; i<=rear;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args){

        BasicOperations b = new BasicOperations(10);
        b.enqueue(10);
        b.enqueue(20);
        b.enqueue(30);
        b.enqueue(40);
        b.enqueue(50);

        b.display();

        b.dequeue();
        b.dequeue();

        b.display();

    }
}
