package com.queue;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({QueuePositiveTest.class, QueueNegativeTest.class})
@Suite.SuiteClasses({ QueuePositiveTests.class, QueueNegativeTests.class })
public class QueueTestSuite {
    /*
        All Positive & Negative Test Cases of LinkedList will run
     */
}