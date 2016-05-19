package com.datastructure.queue.dequeue;

/**
 * Created by kjnam on 2016. 5. 19..
 */
public class Deque {
    DqNode front;
    DqNode rear;

    public Deque() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void insertFront(char item) {
        DqNode newNode = new DqNode();
        newNode.data = item;

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            newNode.rightLink = null;
            newNode.leftLink = null;
        } else {
            front.leftLink = newNode;
            newNode.rightLink = front;
            newNode.leftLink = null;
            front = newNode;
        }
        System.out.println("Inserted Item: " + item);
    }

    public void insertRear(char item) {
        DqNode newNode = new DqNode();
        newNode.data = item;

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
            newNode.rightLink = null;
            newNode.leftLink = null;
        } else {
            rear.rightLink = newNode;
            newNode.leftLink = rear;
            newNode.rightLink = null;
            rear = newNode;
        }
        System.out.println("Inserted Item: " + item);
    }

    public char deleteFront() {
        if (isEmpty()) {
            System.out.println("Delete Failed.DQueue is Empty");
            return 0;
        } else {
            char item = front.data;

            if (front.rightLink == null) {
                front = null;
                rear = null;
            } else {
                front = front.rightLink;
                front.leftLink = null;
            }

            return item;
        }
    }

    public char deleteRear() {
        if (isEmpty()) {
            System.out.println("Delete Failed.DQueue is Empty");
            return 0;
        } else {
            char item = rear.data;

            if (front.leftLink == null) {
                rear = null;
                front = null;
            } else {
                rear = front.leftLink;
                rear.rightLink = null;
            }

            return item;
        }
    }

    public void printDqueue() {
        if (isEmpty()) {
            System.out.println("DQueue is Empty");
        } else {
            DqNode tempDqnode = front;

            System.out.print("DQueue >> [");

            while(tempDqnode != null) {
                System.out.print(tempDqnode.data + " ");
                tempDqnode = tempDqnode.rightLink;
            }

            System.out.println("]");
            System.out.println();
        }
    }

}
