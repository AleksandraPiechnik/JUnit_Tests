package Exercise1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise1_MatrixTest{
    Matrix<Integer> matrix = new Matrix<>(2, 2);

    @BeforeEach
    public void setUp() {

        matrix.mat.get(0).add(0, 1);
        matrix.mat.get(0).add(1, 2);
        matrix.mat.get(1).add(0, 4);
        matrix.mat.get(1).add(1, 6);
    }

    @AfterEach
    public void tearDown() {
    }


    @Test
    public void addMatrixIntegerTest() throws MatrixDimensionMissmatchException {
        Matrix<Integer> matrix2 = new Matrix<>(2, 2);
        Matrix<Integer> matrix3 = new Matrix<>(2, 2);
        Matrix<Integer> matrix = new Matrix<>(2, 2);
        matrix.mat.get(0).add(0, 1);
        matrix.mat.get(0).add(1, 2);
        matrix.mat.get(1).add(0, 4);
        matrix.mat.get(1).add(1, 6);


        matrix2.mat.get(0).add(0, 5);
        matrix2.mat.get(0).add(1, 7);
        matrix2.mat.get(1).add(0, 1);
        matrix2.mat.get(1).add(1, 0);

        matrix3.mat.get(0).add(0, 6);
        matrix3.mat.get(0).add(1, 9);
        matrix3.mat.get(1).add(0, 5);
        matrix3.mat.get(1).add(1, 6);

        Matrix<Integer> matrix4 = matrix.addMatrix(matrix2);
        for (int i = 0; i < matrix4.getCols(); i++) {
            for (int j = 0; j < matrix4.getRows(); j++) {
                assertEquals(matrix4.mat.get(i).get(j), matrix3.mat.get(i).get(j));
            }
        }
    }
    @Test
    public void addMatrixStringTest() throws MatrixDimensionMissmatchException {
        Matrix<String> stringMatrix = new Matrix<String>(2, 2);
        Matrix<String> stringMatrix2 = new Matrix<String>(2, 2);
        Matrix<String> stringMatrix3 = new Matrix<String>(2, 2);

        stringMatrix.mat.get(0).add(0, "1");
        stringMatrix.mat.get(0).add(1, "2");
        stringMatrix.mat.get(1).add(0, "4");
        stringMatrix.mat.get(1).add(1, "6");
        stringMatrix2.mat.get(0).add(0, "5");
        stringMatrix2.mat.get(0).add(1, "7");
        stringMatrix2.mat.get(1).add(0, "1");
        stringMatrix2.mat.get(1).add(1, "0");

        stringMatrix3.mat.get(0).add(0, "15");
        stringMatrix3.mat.get(0).add(1, "27");
        stringMatrix3.mat.get(1).add(0, "41");
        stringMatrix3.mat.get(1).add(1, "60");

        Matrix<String> stringMatrix4 = stringMatrix.addMatrix(stringMatrix2);

        for (int i = 0; i < stringMatrix4.getCols(); i++) {
            for (int j = 0; j < stringMatrix4.getRows(); j++) {
                assertEquals(stringMatrix4.mat.get(i).get(j), stringMatrix3.mat.get(i).get(j));
            }
        }
    }

    @Test
    public void addMatrixThrowsIllegalArgumentException() throws IllegalArgumentException {
        final Matrix<Double> matrix = new Matrix<Double>(1, 1);
        final Matrix<Double> matrix2 = new Matrix<Double>(1, 1);
        matrix.mat.get(0).add(0, 4.5);
        matrix2.mat.get(0).add(0, 3.5);


        Assertions.assertThrows(IllegalArgumentException.class, new Executable() {
            public void execute() throws Throwable {
                matrix.addMatrix(matrix2);
            }
        });
    }

    @Test
    public void addMatrixThrowsMatrixDimensionMismatchException() {
        final Matrix<Integer> matrix2 = new Matrix<Integer>(1, 1);
        final Matrix<Integer> matrix3 = new Matrix<Integer>(2, 2);

        matrix2.mat.get(0).add(0, 5);
        matrix3.mat.get(0).add(0, 5);
        matrix3.mat.get(0).add(1, 7);
        matrix3.mat.get(1).add(0, 1);
        matrix3.mat.get(1).add(1, 0);

        Assertions.assertThrows(MatrixDimensionMissmatchException.class, new Executable() {
            public void execute() throws Throwable {
                matrix2.addMatrix(matrix3);
            }
        });

    }

    @Test
    public void getRowsTest() {
        assertEquals(matrix.getRows(), 2);
    }

    @Test
    public void getColsTest() {
        assertEquals(matrix.getCols(), 2);
    }


}