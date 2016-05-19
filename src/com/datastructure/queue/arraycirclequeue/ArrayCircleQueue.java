package com.datastructure.queue.arraycirclequeue;

/**
 * Created by kjnam on 2016. 5. 19..
 */
public interface ArrayCircleQueue {
    boolean isEmpty();

    boolean isFull();

    void enQueue(char item);

    char deQueue();

    void delete();

    char peek();

    void printQueue();
}
