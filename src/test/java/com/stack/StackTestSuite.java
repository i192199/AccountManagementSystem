package com.stack;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory({StackPositiveTest.class, StackNegativeTest.class})
@Suite.SuiteClasses({ StackPositiveTests.class, StackNegativeTests.class })
public class StackTestSuite {
}
