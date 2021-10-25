package com.linkedlist;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

interface LinkedListNegativeTest {
    /* category marker */
}

@Category(LinkedListNegativeTest.class)
public class LinkedListNegativeTests {
    LinkedList List;
    DoublyLinkedList DList;

    @Before
    public void init() {
        List = new LinkedList();
        DList = new DoublyLinkedList();
    }

    @Test(expected = Exception.class)
    public void testDoublyPopBack() throws Exception {
        DList.pushFront(200);
        DList.popBack();
        DList.popBack(); //error
    }

}
