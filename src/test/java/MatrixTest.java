import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix;
    @BeforeEach
    void setUp() {
        matrix = new Matrix();
    }

    @AfterEach
    void tearDown() {
        matrix = null;
    }

    @Test
    void avgArray() {
        int[] array1 = {1,2,3,4,5};
        double avg = 3.0;
        double avgFunction = matrix.avgArray(array1);
        assertEquals(avg, avgFunction);
    }

    @Test
    void isSquareMatrix() {
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertTrue(matrix.isSquareMatrix(squareMatrix));
    }
    @Test
    void isSquareMatrixNull() {
        int[][] nullMatrix = null;
        assertFalse(matrix.isSquareMatrix(nullMatrix));
    }
    @Test
    void isSquareMatrixEmpty() {
        int[][] emptyMatrix = new int[0][0];
        assertFalse(matrix.isSquareMatrix(emptyMatrix));
    }
    @Test
    void isNonSquareMatrix() {
        int[][] nonSquareMatrix = new int[6][9];
        assertFalse(matrix.isSquareMatrix(nonSquareMatrix));
    }
    @Test
    void isSquareMatrixToothed() {
        int[][] matrix1 = new int[][]{{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
        assertFalse(matrix.isSquareMatrix(matrix1));
    }
}