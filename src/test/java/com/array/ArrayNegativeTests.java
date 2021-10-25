package com.array;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

interface ArrayNegativeTest {
    /* category marker */
}

@Category(ArrayNegativeTest.class)
public class ArrayNegativeTests {
    Array a;
    @Before
    public void init() {
        a = new Array();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testInsertion() {
        a.insert(5, -1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testDeletion() {
        a.delete(-99);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayInsertionDeletion() {
        int [] array = new int[10];
        ArrayInsertion.insert(array,20,15);
    }
}
