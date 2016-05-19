package com.datastructure.queue.dequeue;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kjnam on 2016. 5. 19..
 */
public class DequeTest {
    char deletedItem;
    Deque deQue;

    @Before
    public void setUp() {
        deQue = new Deque();
    }

    @Test
    public void deQueTest() {
        deQue.insertFront('A');
        deQue.printDqueue();

        deQue.insertFront('B');
        deQue.printDqueue();

        deQue.insertRear('C');
        deQue.printDqueue();

        deletedItem = deQue.deleteFront();
        assertThat(deletedItem, is('B'));
        deQue.printDqueue();

        deletedItem = deQue.deleteRear();
        assertThat(deletedItem, is('C'));
        deQue.printDqueue();

        deQue.insertRear('D');
        deQue.printDqueue();

        deQue.insertFront('E');
        deQue.printDqueue();

        deQue.insertFront('F');
        deQue.printDqueue();

    }
}
