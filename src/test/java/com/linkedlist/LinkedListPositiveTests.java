package com.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

interface LinkedListPositiveTest {
    /* category marker */
}

@Category(LinkedListPositiveTest.class)
public class LinkedListPositiveTests {
    LinkedList List;
    DoublyLinkedList DList;
    CircularLinkedList CList;
    @Before
    public void init() {
        List = new LinkedList();
        DList = new DoublyLinkedList();
        CList = new CircularLinkedList();
    }

    @Test
    public void testSinglyAdd() throws Exception {
        List.add(5);
        Assert.assertEquals(List.size(), 1);
        List.add(2);
        Assert.assertEquals(List.size(), 2);
        Assert.assertEquals(5, List.topFront());
        Assert.assertEquals(2, List.topBack());
        List.pushFront(10);
        Assert.assertEquals(10, List.topFront());
        List.pushBack(20);
        Assert.assertEquals(20, List.topBack());
        Assert.assertEquals(List.size(), 4);
            List.display();
    }

    @Test
    public void testSinglyRemove() throws Exception {
        List.add(10);
        List.add(20);
        List.add(30);
        Assert.assertEquals(10, List.topFront());
        List.popFront();
        Assert.assertEquals(20, List.topFront());
        List.popFront();
        Assert.assertEquals(30, List.topFront());
        List.popFront();
        Assert.assertEquals(0, List.size());
    }

    @Test
    public void testDoublyAdd() throws Exception {
        DList.pushFront(20);
        DList.pushFront(25);
        Assert.assertEquals(25, DList.topFront());
        Assert.assertEquals(20, DList.topBack());
        Assert.assertEquals(2, DList.size());
        DList.forwardDisplay();
        Assert.assertTrue(DList.Find(25));
        DList.remove(25);
        Assert.assertFalse(DList.Find(25));
    }

    @Test
    public void testDoublyRemove() throws Exception {
        DList.pushBack(20);
        DList.pushBack(25);
        Assert.assertEquals(2, DList.size());
        DList.reverseDisplay();
        DList.popBack();
        Assert.assertEquals(20, DList.topBack());
        DList.popFront();
        Assert.assertEquals(0, DList.size());
    }

    @Test
    public void testCircularAddRemove() throws Exception {
        CList.pushBack(20);
        CList.pushFront(25);
        Assert.assertEquals(2, CList.size);
        CList.display();
        CList.popBack();
        Assert.assertEquals(1, CList.size);
        CList.popFront();
        Assert.assertEquals(0, CList.size);

    }



}
