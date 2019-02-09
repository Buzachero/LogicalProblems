package br.com.buzachero;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CatsAndMouseTest {
	private final static String CAT_A = "Cat A";
	private final static String CAT_B = "Cat B";
	private final static String MOUSE_C = "Mouse C";

	@Test
	public void testCatsAndMouseWhen_CatA_1_And_CatB_2_And_MouseC_3_ShouldReturn_CatB() {
		int catAPos = 1;
		int catBPos = 2;
		int mouseCPos = 3;
		
		assertEquals(CAT_B, CatsAndMouse.catAndMouse(catAPos, catBPos, mouseCPos));
	}
	
	@Test
	public void testCatsAndMouseWhen_CatA_1_And_CatB_3_And_MouseC_2_ShouldReturn_MouseC() {
		int catAPos = 1;
		int catBPos = 3;
		int mouseCPos = 2;
		
		assertEquals(MOUSE_C, CatsAndMouse.catAndMouse(catAPos, catBPos, mouseCPos));
	}
	
	@Test
	public void testCatsAndMouseWhen_CatA_1_And_CatB_5_And_MouseC_2_ShouldReturn_CatA() {
		int catAPos = 1;
		int catBPos = 5;
		int mouseCPos = 2;
		
		assertEquals(CAT_A, CatsAndMouse.catAndMouse(catAPos, catBPos, mouseCPos));
	}
	
	@Test
	public void testCatsAndMouseWhen_CatA_And_CatB_And_MouseC_InSamePosition_1_ShouldReturn_MouseC() {
		int catAPos = 1;
		int catBPos = 1;
		int mouseCPos = 1;
		
		assertEquals(MOUSE_C, CatsAndMouse.catAndMouse(catAPos, catBPos, mouseCPos));
	}
	

}
