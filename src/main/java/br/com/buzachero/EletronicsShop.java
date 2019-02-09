package br.com.buzachero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EletronicsShop {

	public static int getMoneySpent(int[] keyboards, int[] drives, int b) {		
		int maxSum = 0;
		int tempSum = 0;			
		Arrays.sort(keyboards);
		Arrays.sort(drives);		
		List<Integer> maxElements = new ArrayList<Integer>();
		
		for(int i = keyboards.length-1; i >= 0; i--) {
			for (int j = drives.length-1; j >= 0; j--) {
				tempSum = keyboards[i]+drives[j];
				if(tempSum <= b) {
					maxElements.add(tempSum);
					break;
				}
			}
		}
		
		if(maxElements.size() == 0) {
			return -1;
		}	
		
		for (Integer integer : maxElements) {
			if(integer >= maxSum) {
				maxSum = integer;
			}
		}
				
		return maxSum;
	}
}
