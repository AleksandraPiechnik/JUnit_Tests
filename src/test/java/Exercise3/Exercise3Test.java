package Exercise3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise3Test {

    @Test
    public void substringReturnCorrectValue() {
        Exercise3 substring1 = new Exercise3();
        String a = "abcd";
        String b = "cdabcdab";

        assertEquals(3, substring1.substring(a, b));
    }

    @Test
    public void substringReturnCorrectValueWhenStringBShorterThatA() {
        Exercise3 substring1 = new Exercise3();
        String a = "abc";
        String b = "ca";

        assertEquals(2, substring1.substring(a, b));
    }

    @Test
    public void substringReturnMinusOneWhenThereIsNoMatching() {
        Exercise3 substring1 = new Exercise3();
        String a = "abc";
        String b = "crrr";

        assertEquals(-1, substring1.substring(a, b));
    }
    @Test
    public void substringWhenStringsAreTheSame() {
        Exercise3 substring1 = new Exercise3();
        String a = "abc";
        assertEquals(1, substring1.substring(a, a));
    }
}