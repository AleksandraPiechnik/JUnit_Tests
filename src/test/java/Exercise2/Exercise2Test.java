package Exercise2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise2Test {

    @Test
    public void solutionReturnMinValue() throws ArraySizeException, EmptyArrayException {
        Exercise2 solution1 = new Exercise2();
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(6);
        a.add(4);
        a.add(1);
        a.add(2);

        assertEquals(5, solution1.solution(a));
    }

    @Test
    public void solutionReturnMinValueWhichIsOne() throws ArraySizeException, EmptyArrayException {
        Exercise2 solution1 = new Exercise2();
        List<Integer> a = new ArrayList<Integer>();
        a.add(3);
        a.add(6);
        a.add(4);
        assertEquals(1, solution1.solution(a));
    }

    @Test
    public void IfArrayIsNotNull()
    {
        List<Integer> a = new ArrayList<Integer>();
        a.add(-3);
        a.add(-6);
        a.add(-4);
        assertNotNull(a);
    }
    @Test
    public void solutionReturnMinValueWhichIsOneWhenRestNumbersAreNegative() throws ArraySizeException, EmptyArrayException {
        Exercise2 solution1 = new Exercise2();
        List<Integer> a = new ArrayList<Integer>();
        a.add(-3);
        a.add(-6);
        a.add(-4);
        assertEquals(1, solution1.solution(a));
    }

    @Test
    public void solutionThrowsEmptyArrayException() {
        final Exercise2 solution1 = new Exercise2();
        final List<Integer> a = new ArrayList<Integer>();

        Assertions.assertThrows(EmptyArrayException.class, new Executable() {
            public void execute() throws Throwable {
                solution1.solution(a);
            }
        });
    }

    @Test
    public void solutionThrowsArraySizeException() {
        final Exercise2 solution1 = new Exercise2();
        final List<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 100001; i++) {
            a.add(i);
        }
        Assertions.assertThrows(ArraySizeException.class, new Executable() {
            public void execute() throws Throwable {
                solution1.solution(a);
            }
        });
    }
}