package com.datastructure.queue.arrayqueue;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public class ArrayQueueImpl implements ArrayQueue{
    private int front;
    private int rear;
    private int queueSize;
    private char itemArray[];

    public ArrayQueueImpl(int queueSize) {
        front = -1;
        rear = -1;
        this.queueSize = queueSize;
        itemArray = new char[this.queueSize];
    }

    @Override
    public boolean isEmpty() {
        return (front == rear);
    }

    @Override
    public boolean isFull() {
        return (rear == this.queueSize-1);
    }

    @Override
    public void enQueue(char item) {
        if (isFull()) {
            System.out.println("Insert Failed. Array Queue is Full");
        } else {
            itemArray[++rear] = item;
            System.out.println("Inserted Item: " + item);
        }
    }

    @Override
    public char deQueue() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Array Queue is Empty");
            return 0;
        } else {
            return itemArray[++front];
        }
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Array Queue is Empty");
        } else {
            ++front;
        }
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Peek Failed. Array Queue is Empty");
            return 0;
        } else {
            return itemArray[front+1];
        }
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Array Queue is Empty");
        } else {
            System.out.print("Array Queue >> [");
            for (int i=front+1; i<=rear; i++) {
                System.out.print(itemArray[i] + " ");
            }
            System.out.println("]");
            System.out.println();
        }
    }
}