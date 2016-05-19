package com.datastructure.queue.arraycirclequeue;

/**
 * Created by kjnam on 2016. 5. 19..
 */
public class ArrayCircleQueueImpl implements ArrayCircleQueue {
    private int front;
    private int rear;
    private int queueSize;
    private char itemArray[];

    public ArrayCircleQueueImpl(int queueSize) {
        front = 0;
        rear = 0;
        this.queueSize = queueSize;
        itemArray = new char[queueSize];
    }

    @Override
    public boolean isEmpty() {
        return (front == rear);
    }

    @Override
    public boolean isFull() {
        return (((rear+1) % this.queueSize) == front);
    }

    @Override
    public void enQueue(char item) {
        if (isFull()) {
            System.out.println("Insert Failed. Array Circle Queue is Full");
        } else {
            rear = (rear+1) % this.queueSize;
            itemArray[rear] = item;
            System.out.println("Inserted Item: " + item);
        }
    }

    @Override
    public char deQueue() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Array Circle Queue is Empty");
            return 0;
        } else {
            front = (front+1) % this.queueSize;
            return itemArray[front];
        }
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Array Circle Queue is Empty");
        } else {
            front = (front+1) % this.queueSize;
        }
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Peek Failed. Array Circle Queue is Empty");
            return 0;
        } else {
            return itemArray[(front+1) % this.queueSize];
        }
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Array Circle Queue is Empty");
        } else {
            System.out.print("Array Queue >> [");

            int begin = (front+1) % this.queueSize;
            int end = (rear+1) % this.queueSize;

            for (int i = begin; i!=end; i=++i % this.queueSize) {
                System.out.print(itemArray[i] + " ");
            }
            System.out.println("]");
            System.out.println();
        }
    }
}
