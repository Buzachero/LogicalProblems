package br.com.buzachero;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MatrixTest 
{
    private static Matrix matrix;
    private static int[][] matrixA = {
		{1, 5,  3,  2},
		{4, 8, -5,  6},
		{7, 3,  4,  5},
		{2, 5,  9, -9}
    };
    
    private static int[][] matrixB = {
		{1, 5,  3},
		{4, 8, -5},
		{7, 3,  4}		
    };
    
    private static int[][] matrixC = {
		{1, 5},
		{4, 8}	
    };
    
    private static int[][] matrixD = {
    	{1, 5,  3,  2, 7},
		{4, 8, -5,  6, 2},
		{7, 3,  4,  5, 1},
		{2, 5,  9, -9, 9},
		{2, 5,  9, -9, 10}
    };
    
    @BeforeClass
	public static void setUp() {
    	matrix = new Matrix();
    }
    
    
    @Test
    public void calculateDiffDiagonalMatrixA_ShouldReturn2() {
    	assertEquals(2, matrix.diffDiagonal(matrixA, 4));
    }
    
    @Test
    public void calculateDiffDiagonalMatrixB_ShouldReturnMinus5() {
    	assertEquals(-5, matrix.diffDiagonal(matrixB, 3));
    }
    
    @Test
    public void calculateDiffDiagonalMatrixC_ShouldReturn0() {
    	assertEquals(0, matrix.diffDiagonal(matrixC, 2));
    }
    
    @Test
    public void calculateDiffDiagonalMatrixD_ShouldReturnMinus10() {
    	assertEquals(-10, matrix.diffDiagonal(matrixD, 5));
    }
}
