package com.datastructure.stack.arraystack;


import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public class ArrayStackTest {

    int stackSize;
    char popItem;
    ArrayStack arrayStack;

    @Before
    public void setUp() {
        stackSize = 5;
    }

    @Test
    public void arrayStackTest() {
        arrayStack = new ArrayStackImpl(stackSize);

        arrayStack.push('A');
        arrayStack.printStack();

        arrayStack.push('B');
        arrayStack.printStack();

        arrayStack.push('C');
        arrayStack.printStack();

        popItem = arrayStack.pop();
        assertThat(popItem, is('C'));

        System.out.println("After pop > C");
        arrayStack.printStack();
    }


}
