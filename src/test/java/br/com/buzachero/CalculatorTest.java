package br.com.buzachero;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CalculatorTest {	
	
	@Test
	public void numberA10256AndNumberB512_ShouldReturnMinus1() {
		assertEquals(-1, Calculator.calculateNumberC(10256, 512));
	}
	
	@Test
	public void numberA512AndNumberB10256_ShouldReturnMinus1() {
		assertEquals(-1, Calculator.calculateNumberC(512, 10256));
	}
	
	@Test
	public void numberAMinus512AndNumberB10256_ShouldReturnMinus1() {
		assertEquals(-1, Calculator.calculateNumberC(-512, 10256));
	}

	@Test
	public void numberAMinus10256AndNumberB512_ShouldReturnMinus1() {
		assertEquals(-1, Calculator.calculateNumberC(-10256, 512));
	}
	
	@Test
	public void numberA325AndNumberB12_ShouldReturn31225() {
		assertEquals(31225, Calculator.calculateNumberC(325, 12));
	}
	
	@Test
	public void numberA12AndNumberB325_ShouldReturn13225() {
		assertEquals(13225, Calculator.calculateNumberC(12, 325));
	}
	
	@Test
	public void numberA1AndNumberB1_ShouldReturn11() {
		assertEquals(11, Calculator.calculateNumberC(1, 1));
	}
	
	@Test
	public void numberA0AndNumberB1_ShouldReturn1() {
		assertEquals(1, Calculator.calculateNumberC(0, 1));
	}
	
	@Test
	public void numberA0AndNumberB0_ShouldReturn0() {
		assertEquals(0, Calculator.calculateNumberC(0, 0));
	}
	
}
