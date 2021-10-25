package com.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

interface StackPositiveTest {
    /* category marker */
}

@Category(StackPositiveTest.class)
public class StackPositiveTests {
    Stack s;
    StackArray s1;
    @Before
    public void init() {
        s = new Stack();
        s1 = new StackArray();
    }

    @Test
    public void testStack() {
        Stack.push(10);
        Assert.assertEquals(Stack.size, 1);
        Stack.push(20);
        Stack.push(30);
        Assert.assertEquals(Stack.getSize(), 3);
        Stack.display();
        Stack.pop();
        Assert.assertEquals(Stack.size, 2);
        Assert.assertEquals(Stack.top(), 20);
        Stack.pop();
        Stack.pop();
        Assert.assertEquals(Stack.getSize(), 0);
    }

    @Test
    public void testStackArray() {
        StackArray.push(10);
        Assert.assertEquals(StackArray.size, 1);
        StackArray.push(20);
        StackArray.push(30);
        Assert.assertEquals(StackArray.size, 3);
        StackArray.display();
        StackArray.pop();
        Assert.assertEquals(StackArray.size, 2);
        StackArray.pop();
        StackArray.pop();
        Assert.assertEquals(StackArray.size, 0);
    }
}
