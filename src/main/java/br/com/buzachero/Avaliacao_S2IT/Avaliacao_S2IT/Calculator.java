package br.com.buzachero.Avaliacao_S2IT.Avaliacao_S2IT;

public class Calculator {
	
	public static int calculateNumberC(int a, int b) {
		final int MAX_NUMBER_C = 1000000;
		
		/* considerando os inteiros sempre positivos 
			pois nao foi definido regra para numeros negativos
		*/
		a = Math.abs(a);
		b = Math.abs(b);
		
		String stringNumberA = String.valueOf(a);
		String stringNumberB = String.valueOf(b);
				
		char[] charNumberA = stringNumberA.toCharArray();
		char[] charNumberB = stringNumberB.toCharArray();
		
		int numberCLength = charNumberA.length + charNumberB.length;
		char[] numberC = new char[numberCLength];		
		
		int minimumLength = 0;		
		
		if(charNumberA.length < charNumberB.length) {
			minimumLength = charNumberA.length;
		} else {
			minimumLength = charNumberB.length;
		}
		
		int indexNumberC = 0; 
		int i;
		for (i = 0; i < minimumLength; i++) {
			numberC[indexNumberC++] = charNumberA[i];			
			numberC[indexNumberC++] = charNumberB[i];
		}
		
		if(i > charNumberA.length-1) {
			for (int j = i; j < charNumberB.length; j++) {
				numberC[indexNumberC++] = charNumberB[j];
			}
		} else if(i > charNumberB.length-1) {
			for (int j = i; j < charNumberA.length; j++) {
				numberC[indexNumberC++] = charNumberA[j];
			}
		}
		
		String stringNumberC = String.valueOf(numberC);
		int c = Integer.valueOf(stringNumberC);
				
		if(c > MAX_NUMBER_C) {
			return -1;
		}
		
		return c;
	}
}
