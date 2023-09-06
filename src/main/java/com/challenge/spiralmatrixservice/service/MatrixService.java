package com.challenge.spiralmatrixservice.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MatrixService {

    public int[] fibonacci;

    public int[][] getFibonacciSpiralMatrix(int rows, int cols){
        int size = rows*cols;  //TODO validations

        //Create Fibonacci Series
        fib(size);



        int[][] response = new int[rows][cols];
        for(int[] arr:response){
            Arrays.fill(arr,1);
        }
        return response;
    }

    public void fib(int n) {
        fibonacci = new int[n+2];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }
}
