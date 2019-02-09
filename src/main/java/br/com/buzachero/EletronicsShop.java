package br.com.buzachero;

import java.util.Arrays;

public class EletronicsShop {

	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {		
		int maxSum = 0;
		int tempSum = 0;			
		Arrays.sort(keyboards);
		Arrays.sort(drives);		
		
		for(int i = keyboards.length-1; i >= 0; i--) {
			for (int j = drives.length-1; j >= 0; j--) {
				tempSum = keyboards[i]+drives[j];
				if(tempSum <= b) {
					if(tempSum >= maxSum) {
						maxSum = tempSum;
					}
					break;
				}
			}
		}
		
		if(maxSum == 0) {
			return -1;
		}	
				
		return maxSum;
	}
}
