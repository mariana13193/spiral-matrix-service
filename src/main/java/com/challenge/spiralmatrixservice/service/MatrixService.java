package com.challenge.spiralmatrixservice.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MatrixService {

    public int[][] getFibonacciSpiralMatrix(int rows, int cols){
        int[][] response = new int[rows][cols];
        for(int[] arr:response){
            Arrays.fill(arr,1);
        }
        return response;
    }
}
