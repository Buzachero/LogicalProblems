package br.com.buzachero;

public class CatsAndMouse {

	public static String catAndMouse(int x, int y, int z) {
		final String CAT_A = "Cat A";
		final String CAT_B = "Cat B";
		final String MOUSE_C = "Mouse C";
		
		int catADistance = Math.abs(z - x);
		int catBDistance = Math.abs(z - y);
		
		if(catADistance < catBDistance) {
			return CAT_A;
		}
		
		if(catBDistance < catADistance) {
			return CAT_B;
		}
					
		return MOUSE_C;
	}
}
