package com.challenge.spiralmatrixservice;

import com.challenge.spiralmatrixservice.service.MatrixService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MatrixServiceTest {

private MatrixService matrixService;

    @BeforeEach
    public void setUp() {
        this.matrixService = new MatrixService();
    }

    @Test
    public void fib_series_square_is_ok(){
        int size = 9;
        matrixService.fib(size);
        for (int i = 0; i < size; i++)
            System.out.print(matrixService.fibonacci[i] + " ");
        assertNotNull(matrixService.fibonacci);
        assertEquals(matrixService.fibonacci.length,size);
    }

    @Test
    public void fib_series_non_square(){
        int size = 15;
        matrixService.fib(size);
        for (int i = 0; i < size; i++)
            System.out.print(matrixService.fibonacci[i] + " ");
        assertNotNull(matrixService.fibonacci);
        assertEquals(matrixService.fibonacci.length,size);
    }

    @Test
    public void spiral_matrix(){
        int[][] response = matrixService.getFibonacciSpiralMatrix(5,5);
        for(int[] row: response)
            System.out.print(Arrays.toString(row) + "\n");
    }
}
