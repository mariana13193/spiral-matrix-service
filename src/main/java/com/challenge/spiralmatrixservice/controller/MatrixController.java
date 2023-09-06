package com.challenge.spiralmatrixservice.controller;

import com.challenge.spiralmatrixservice.service.MatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spiral")
public class MatrixController {

    @Autowired
    private MatrixService matrixService;

    @GetMapping
    public int[][] getFibonacciSpiralMatrix(@RequestParam(name = "rows") Integer rows, @RequestParam(name = "cols") Integer cols){
        return matrixService.getFibonacciSpiralMatrix(rows,cols);
    }
}
