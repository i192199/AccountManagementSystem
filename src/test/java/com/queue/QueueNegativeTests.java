package com.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

interface QueueNegativeTest {
    /* category marker */
}

@Category(QueueNegativeTest.class)
public class QueueNegativeTests {
    Queue q1;
    QueueArray q2;
    @Before
    public void init() {
        q1 = new Queue();
        q2 = new QueueArray(10);
    }

    @Test
    public void testQueue() {
        // Dequeue an empty string
        Queue.enqueue(10);
        Assert.assertEquals(Queue.size, 1);
        Queue.dequeue();
        Queue.dequeue();
    }

    @Test
    public void testQueueArray() {
        QueueArray.enqueue(10);
        Assert.assertEquals(QueueArray.size, 1);
        QueueArray.dequeue();
        QueueArray.dequeue();
    }
}
