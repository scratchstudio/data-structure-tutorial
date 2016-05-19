package com.datastructure.queue.linkedqueue;

/**
 * Created by kjnam on 2016. 5. 19..
 */
public interface LinkedQueue {
    boolean isEmpty();

    void enQueue(char item);

    char deQueue();

    void delete();

    char peek();

    void printQueue();
}

