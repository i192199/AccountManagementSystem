package com.array;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({ArrayPositiveTest.class, ArrayNegativeTest.class})
@Suite.SuiteClasses({ ArrayPositiveTests.class, ArrayNegativeTests.class })
public class ArrayTestSuite {
    /*
        All Positive & Negative Test Cases of array will run
     */
}
