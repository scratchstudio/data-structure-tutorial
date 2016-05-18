package com.datastructure.stack.arraystack;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public class ArrayStackImpl implements ArrayStack {
    private int top;
    private int stackSize;
    private char itemArray[];

    public ArrayStackImpl(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        itemArray = new char[this.stackSize];
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == this.stackSize-1);
    }

    @Override
    public void push(char item) {
        if (isFull()) {
            System.out.println("Insert Failed. Array Stack is Full");
        } else {
            itemArray[++top] = item;
            System.out.println("Inserted Item: " + item);
        }
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            System.out.println("Pop Failed. Array Stack is Empty");
            return 0;
        } else {
            return itemArray[top--];
        }
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Array Stack is Empty");
        } else {
            top--;
        }
    }

    public char peek() {
        if (isEmpty()) {
            System.out.println("Peek Failed. Array Stack is Empty");
            return 0;
        } else {
            return itemArray[top];
        }
    }

    @Override
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Array Stack is Empty");
        } else {
            System.out.print("Array Stack >> [");
            for (int i=0; i<=top; i++) {
                System.out.print(itemArray[i]);
                System.out.print(" ");
            }
            System.out.println("]");
        }
    }
}