package com.datastructure.queue.arrayqueue;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public interface ArrayQueue {
    boolean isEmpty();

    boolean isFull();

    void enQueue(char item);

    char deQueue();

    void delete();

    char peek();

    void printQueue();
}
