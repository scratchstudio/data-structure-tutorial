package com.datastructure.stack.apply;

import org.junit.Test;

/**
 * Created by kjnam on 2016. 5. 18..
 */
public class OptExpTest {

    @Test
    public void optExpTest() {
        OptExp opt = new OptExp();
        String expression = "(3*5)-(6/2)";
        char postfix[];

        System.out.println("Expression: " + expression);

        if(opt.testPair(expression))
            System.out.println("괄호의 짝이 맞음");
        else
            System.out.println("괄호의 짝이 맞지 않음");

        System.out.print("후위 표기식: ");
        postfix = opt.toPostfix(expression);
        System.out.print(postfix);
    }


}
