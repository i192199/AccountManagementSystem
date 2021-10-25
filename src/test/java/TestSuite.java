import com.array.ArrayTestSuite;
import com.linkedlist.LinkedListTestSuite;
import com.queue.QueueTestSuite;
import com.stack.StackTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ArrayTestSuite.class,
        LinkedListTestSuite.class,
        QueueTestSuite.class,
        StackTestSuite.class
})

public class TestSuite {
}
