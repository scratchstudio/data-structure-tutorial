package com.datastructure.stack.linkedstack;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public class LinkedStackImpl implements LinkedStack {
    private LinkedStackNode top;


    public boolean isEmpty() {
        return (top == null);
    }

    public void push(char item) {
        LinkedStackNode newNode = new LinkedStackNode();
        newNode.data = item;
        newNode.link = top;
        top = newNode;
        //System.out.println("Inserted Item: " + item);
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Pop Failed. Linked Stack is Empty");
            return 0;
        } else {
            char item = top.data;
            top = top.link;
            return item;
        }
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Linked Stack is Empty");
        } else {
            top = top.link;
        }
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Peek Failed. Linked Stack is Empty");
            return 0;
        } else {
            return top.data;
        }
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Linked Stack is Empty");
        } else {
            LinkedStackNode tempNode = top;
            System.out.print("Linked Stack >> [");

            while (tempNode != null) {
                System.out.print(tempNode.data);
                System.out.print(" ");

                tempNode = tempNode.link;
            }
            System.out.println("]");
        }
    }
}
