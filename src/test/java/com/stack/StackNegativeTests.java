package com.stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

interface StackNegativeTest {
    /* category marker */
}

@Category(StackNegativeTest.class)
public class StackNegativeTests {
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
        Stack.pop();
        Assert.assertEquals(Stack.size, 0);
        Stack.pop();
    }

    @Test
    public void testStackArray() {
        StackArray.push(10);
        Assert.assertEquals(StackArray.size, 1);
        StackArray.pop();
        StackArray.pop();
        Assert.assertEquals(StackArray.size, 0);
    }
}
