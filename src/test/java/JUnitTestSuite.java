import Exercise1.Exercise1_MatrixTest;
import Exercise2.Exercise2Test;
import Exercise3.Exercise3Test;
import Exercise4.Exercise4Test;
import Exercise5.Exercise5Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)

@Suite.SuiteClasses({
        Exercise1_MatrixTest.class,
        Exercise2Test.class,
        Exercise3Test.class,
        Exercise4Test.class,
        Exercise5Test.class

})
public class JUnitTestSuite {
}
