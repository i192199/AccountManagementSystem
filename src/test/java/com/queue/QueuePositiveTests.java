package com.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

interface QueuePositiveTest {
    /* category marker */
}

@Category(QueuePositiveTest.class)
public class QueuePositiveTests {
    Queue q1;
    QueueArray q2;
    @Before
    public void init() {
        q1 = new Queue();
        q2 = new QueueArray(10);
    }

    @Test
    public void testQueue() {
        Queue.enqueue(10);
        Assert.assertEquals(Queue.size, 1);
        Queue.enqueue(20);
        Queue.enqueue(30);
        Assert.assertEquals(Queue.size, 3);
        Queue.display();
        Queue.dequeue();
        Queue.dequeue();
        Assert.assertEquals(Queue.size, 1);
    }

    @Test
    public void testQueueArray() {
        QueueArray.enqueue(10);
        Assert.assertEquals(QueueArray.size, 1);
        QueueArray.enqueue(20);
        QueueArray.enqueue(30);
        Assert.assertEquals(QueueArray.size, 3);
        QueueArray.display();
        QueueArray.dequeue();
        QueueArray.dequeue();
        Assert.assertEquals(QueueArray.size, 1);
    }
}
