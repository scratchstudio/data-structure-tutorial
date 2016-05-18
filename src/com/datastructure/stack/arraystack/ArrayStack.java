package com.datastructure.stack.arraystack;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public interface ArrayStack {
    boolean isEmpty();

    boolean isFull();

    void push(char item);

    char pop();

    void delete();

    char peek();

    void printStack();
}
