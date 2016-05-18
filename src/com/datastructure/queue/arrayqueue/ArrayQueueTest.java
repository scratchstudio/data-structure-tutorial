package com.datastructure.queue.arrayqueue;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public class ArrayQueueTest {
    int queueSize;
    char deletedItem = ' ';
    ArrayQueue arrayQueue;

    @Before
    public void setUp() {
        queueSize = 3;
        arrayQueue = new ArrayQueueImpl(queueSize);
    }

    @Test
    public void arrayQueueTest() {
        arrayQueue.enQueue('A');
        arrayQueue.printQueue();
        System.out.println();

        arrayQueue.enQueue('B');
        arrayQueue.printQueue();

        deletedItem = arrayQueue.deQueue();
        System.out.println("After deQueue: ");
        assertThat(deletedItem, is('A'));
        arrayQueue.printQueue();

        arrayQueue.enQueue('C');
        arrayQueue.printQueue();

        deletedItem = arrayQueue.deQueue();
        assertThat(deletedItem, is('B'));
        System.out.println("After deQueue: ");
        arrayQueue.printQueue();

        deletedItem = arrayQueue.deQueue();
        assertThat(deletedItem, is('C'));
        System.out.println("After deQueue: ");
        arrayQueue.printQueue();

        deletedItem = arrayQueue.deQueue();
        arrayQueue.printQueue();

    }
}
