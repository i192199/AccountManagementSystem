package com.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

interface ArrayPositiveTest {
    /* category marker */
}

@Category(ArrayPositiveTest.class)
public class ArrayPositiveTests {
    Array a;
    @Before
    public void init() {
        a = new Array();
    }

    @Test
    public void testValues() {
        int[] arr = {1, 2, 3, 4};
        int[] results = a.getValues(arr);
        for(int i = 0; i < arr.length; i++) {
            Assert.assertEquals(arr[i], results[i]);
        }
        a.display();
    }

    @Test
    public void testInsertionDeletion() {
        a.insert(5, 0);
        Assert.assertEquals(a.size, 1);
        Assert.assertEquals(a.array[0], 5);
        Assert.assertTrue(a.linearSearch(5));
        a.display();
        a.insert(10, 1);
        Assert.assertEquals(a.size, 2);
        Assert.assertTrue(a.linearSearch(10));
        a.display();
        a.delete(1);
        a.bubbleSort();
        Assert.assertEquals(a.size, 1);
        Assert.assertFalse(a.binarySearch(10, 0, a.size-1));
        a.delete(0);
        Assert.assertEquals(a.size, 0);
        Assert.assertFalse(a.binarySearch(5, 0, a.size-1));
    }

    @Test
    public void testArrayInsertionDeletion() {
        int[] arr = {1, 2, 3, 4};
        ArrayDeletion.display(arr);
        ArrayDeletion.delete(arr, 0);
        ArrayDeletion.display(arr);
        int [] array = new int[10];
        ArrayInsertion.insert(array,56,1);
        ArrayInsertion.insert(array,5,2);
        ArrayInsertion.insert(array,1,0);
        ArrayInsertion.insert(array,12,4);
        ArrayInsertion.insert(array,2,6);
        ArrayInsertion.insert(array,90,3);
        ArrayInsertion.insert(array,16,7);
    }

}
