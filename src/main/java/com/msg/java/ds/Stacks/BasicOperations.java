package com.msg.java.ds.Stacks;

public class BasicOperations {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX]; // Maximum size of Stack

    boolean isEmpty(){
        return top<0;
    }

    BasicOperations(){
            top = -1;
    }

    boolean push(int x){
        if(top >= MAX-1){
            return false;
        }
        else{
            a[++top] = x;
            return true;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }
        else {
            return a[top];
        }
    }

    void display(){
        for(int i=top; i>-1; i--){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args){
        BasicOperations b = new BasicOperations();
        b.push(10);
        b.push(20);
        b.push(30);

        b.display();

        b.pop();
        int a= b.peek();
        System.out.println(a);

        b.display();
    }
}
