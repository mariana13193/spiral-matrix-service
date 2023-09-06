package com.challenge.spiralmatrixservice.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Iterator;

@Service
public class MatrixService {

    public int[] fibonacci;

    public int[][] getFibonacciSpiralMatrix(int rows, int cols){
        int size = rows*cols;  //TODO validations

        //First Create Fibonacci Series
        fib(size);

        //Then Spiral Cycles
        int[][] response = new int[rows][cols];

        int rowBegin=0;
        int rowEnd=rows-1;
        int columnBegin=0;
        int columnEnd=cols-1;


        Iterator<Integer> iterator = Arrays.stream(fibonacci).iterator();
        int current = iterator.next();

        while(rowBegin<=rowEnd && columnBegin<=columnEnd && iterator.hasNext()){

            for(int i=columnBegin;i<=columnEnd;i++){

                response[rowBegin][i]=current;

                current=iterator.next();

            }
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd && iterator.hasNext();i++){

                response[i][columnEnd]=current;

                current=iterator.next();

            }
            columnEnd--;

            if(rowBegin<=rowEnd){
                for(int i=columnEnd;i>=columnBegin && iterator.hasNext();i--){

                    response[rowEnd][i]=current;

                    current=iterator.next();

                }

            }
            rowEnd--;

            if(columnBegin<=columnEnd){
                for(int i=rowEnd;i>=rowBegin && iterator.hasNext();i--){

                    response[i][columnBegin]=current;

                    current=iterator.next();

                }

            }
            columnBegin++;

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
