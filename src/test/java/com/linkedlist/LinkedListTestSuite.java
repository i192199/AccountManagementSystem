package com.linkedlist;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({LinkedListPositiveTest.class, LinkedListNegativeTest.class})
@Suite.SuiteClasses({ LinkedListPositiveTests.class, LinkedListNegativeTests.class })
public class LinkedListTestSuite {
    /*
        All Positive & Negative Test Cases of LinkedList will run
     */
}
