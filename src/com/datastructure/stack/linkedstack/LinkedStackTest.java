package com.datastructure.stack.linkedstack;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public class LinkedStackTest {

    char popItem;
    LinkedStack linkedStack;

    @Before
    public void setUp() {

    }

    @Test
    public void linekdStackTest() {
        linkedStack = new LinkedStackImpl();

        linkedStack.push('A');
        linkedStack.printStack();

        linkedStack.push('B');
        linkedStack.printStack();

        linkedStack.push('C');
        linkedStack.printStack();

        popItem = linkedStack.pop();
        assertThat(popItem, is('C'));

        System.out.println("After pop > C");
        linkedStack.printStack();
    }


}
