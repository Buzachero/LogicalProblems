package br.com.buzachero;

public class Matrix 
{
    
	public int diffDiagonal(int[][] mtrx, int n) {
		int sumDiagonal1 = 0;
		int sumDiagonal2 = 0;	
		
		for (int i = 0; i < mtrx.length; i++) {
			sumDiagonal1 += mtrx[i][i];
			sumDiagonal2 += mtrx[i][n-i-1];
		}
		
		return (sumDiagonal1 - sumDiagonal2);
	}
}
