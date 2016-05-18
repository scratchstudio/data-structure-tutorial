package com.datastructure.stack.apply;

import com.datastructure.stack.linkedstack.LinkedStack;
import com.datastructure.stack.linkedstack.LinkedStackImpl;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public class OptExp {
    private String exp;
    private int expSize;
    private char testCh;
    private char openPair;

    public boolean testPair(String exp) {
        this.exp = exp;
        LinkedStack linkedStack = new LinkedStackImpl();
        expSize = this.exp.length();

        for (int i=0; i<expSize; i++) {
            testCh = this.exp.charAt(i);
            switch (testCh) {
                case '(' :
                case '{' :
                case '[' :
                    linkedStack.push(testCh);
                    break;

                case ')' :
                case '}' :
                case ']' :
                    if(linkedStack.isEmpty())
                        return false;
                    else {
                        openPair = linkedStack.pop();
                        boolean isWrongPair = (openPair == '(' && testCh != ')')
                                           || (openPair == '{' && testCh != '}')
                                           || (openPair == '[' && testCh != ']');

                        if(isWrongPair)
                            return false;
                        else
                            break;
                    }
            }
        }

        if (linkedStack.isEmpty())
            return true;
        else
            return false;
    }

    public char[] toPostfix(String infix) {
        char testCh;
        exp = infix;
        int expSize = 10;
        int j=0;
        char postfix[] = new char[expSize];
        LinkedStack linkedStack = new LinkedStackImpl();

        for (int i=0; i<=expSize; i++) {
            testCh = this.exp.charAt(i);
            switch (testCh) {
                case '0' :
                case '1' :
                case '2' :
                case '3' :
                case '4' :
                case '5' :
                case '6' :
                case '7' :
                case '8' :
                case '9' :
                    postfix[j++] = testCh;
                    break;

                case '+' :
                case '-' :
                case '*' :
                case '/' :
                    linkedStack.push(testCh);
                    break;

                case ')' :
                    postfix[j++] = linkedStack.pop();
                    break;
            }
        }

        postfix[j] = linkedStack.pop();
        return postfix;
    }
}
