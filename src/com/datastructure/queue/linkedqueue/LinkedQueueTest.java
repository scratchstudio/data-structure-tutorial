package com.datastructure.queue.linkedqueue;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kjnam on 2016. 5. 19..
 */
public class LinkedQueueTest {
    char deletedItem;
    LinkedQueue linkedQueue;

    @Before
    public void setUp() {
        linkedQueue = new LinkedQueueImpl();
    }

    @Test
    public void linkedQueueTest() {
        linkedQueue.enQueue('A');
        linkedQueue.printQueue();

        linkedQueue.enQueue('B');
        linkedQueue.printQueue();

        deletedItem = linkedQueue.deQueue();
        assertThat(deletedItem, is('A'));
        linkedQueue.printQueue();

        linkedQueue.enQueue('C');
        linkedQueue.printQueue();

        deletedItem = linkedQueue.deQueue();
        assertThat(deletedItem, is('B'));
        linkedQueue.printQueue();

        deletedItem = linkedQueue.deQueue();
        assertThat(deletedItem, is('C'));
        linkedQueue.printQueue();

        deletedItem = linkedQueue.deQueue();
    }
}
