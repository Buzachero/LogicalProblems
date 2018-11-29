package br.com.buzachero;

public class CountingValleys {

	public static int countingValleys(int n, String s) {
		int previousPosition = 0;
		int currentPosition = 0;		
		int countValleys = 0;
		
		for (int i = 0; i < s.length(); i++) {			
			previousPosition = currentPosition;			

			if (s.charAt(i) == 'D') {
				currentPosition--;
			} else if (s.charAt(i) == 'U') {
				currentPosition++;
			}
			
			
			if(previousPosition == 0 && currentPosition == -1) {
				countValleys += 1;
			}
			
		}
		
		return countValleys;
	}
}
