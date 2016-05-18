package com.datastructure.stack.linkedstack;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public interface LinkedStack {
    boolean isEmpty();

    void push(char item);

    char pop();

    void delete();

    char peek();

    public void printStack();
}
