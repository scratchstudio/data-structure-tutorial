package com.datastructure.queue.arraycirclequeue;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kjnam on 2016. 5. 19..
 */
public class ArrayCircleQueueTest {
    int queueSize;
    char deletedItem = ' ';
    ArrayCircleQueue arrayCircleQueue;

    @Before
    public void setUp() {
        queueSize = 4;
        arrayCircleQueue = new ArrayCircleQueueImpl(queueSize);
    }

    @Test
    public void arrayQueueTest() {
        arrayCircleQueue.enQueue('A');
        arrayCircleQueue.printQueue();
        System.out.println();

        arrayCircleQueue.enQueue('B');
        arrayCircleQueue.printQueue();

        deletedItem = arrayCircleQueue.deQueue();
        System.out.println("After deQueue: ");
        assertThat(deletedItem, is('A'));
        arrayCircleQueue.printQueue();

        arrayCircleQueue.enQueue('C');
        arrayCircleQueue.printQueue();

        arrayCircleQueue.enQueue('D');
        arrayCircleQueue.printQueue();

        arrayCircleQueue.enQueue('E');
        arrayCircleQueue.printQueue();

    }
}
