package com.datastructure.queue.linkedqueue;

/**
 * Created by kjnam on 2016. 5. 19..
 */
public class LinkedQueueImpl implements LinkedQueue {
    QNode front;
    QNode rear;

    public LinkedQueueImpl() {
        front = null;
        rear = null;
    }

    @Override
    public boolean isEmpty() {
        return (front == null);
    }

    @Override
    public void enQueue(char item) {
        QNode newNode = new QNode();
        newNode.data = item;
        newNode.link = null;

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
        }
        System.out.println("Inserted Item: " + item);
    }

    @Override
    public char deQueue() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Linked Queue is Empty");
            return 0;
        } else {
            char item = front.data;
            front = front.link;
            if (front == null)
                rear = null;

            return item;
        }
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.println("Delete Failed. Linked Queue is Empty");
        } else {
            front = front.link;
            if (front == null)
                rear = null;
        }
    }

    @Override
    public char peek() {
        if (isEmpty()) {
            System.out.println("Peek Failed. Linked Queue is Empty");
            return 0;
        } else {
            return front.data;
        }
    }

    @Override
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Linked Queue is Empty");
        } else {
            QNode tempNode = front;
            System.out.print("Linked Queue >> [");

            while (tempNode != null) {
                System.out.print(tempNode.data + " ");
                tempNode = tempNode.link;
            }

            System.out.println("]");
            System.out.println();
        }
    }
}
