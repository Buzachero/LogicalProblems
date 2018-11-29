package br.com.buzachero;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountingValleysTest {

	@Test
	public void testCountingValleysWhen8StepsAndUDDDUDUU_ShouldReturn1() {
		int numberOfSteps = 8;
		String charPath = "UDDDUDUU";
		assertEquals(1, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen2StepsAndUD_ShouldReturn0() {
		int numberOfSteps = 2;
		String charPath = "UD";
		assertEquals(0, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen2StepsAndDU_ShouldReturn1() {
		int numberOfSteps = 2;
		String charPath = "DU";
		assertEquals(1, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen4StepsAndDDUU_ShouldReturn1() {
		int numberOfSteps = 4;
		String charPath = "DDUU";
		assertEquals(1, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen4StepsAndUUDD_ShouldReturn0() {
		int numberOfSteps = 4;
		String charPath = "UUDD";
		assertEquals(0, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen4StepsAndUDDU_ShouldReturn1() {
		int numberOfSteps = 4;
		String charPath = "UDDU";
		assertEquals(1, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen4StepsAndDUUD_ShouldReturn1() {
		int numberOfSteps = 4;
		String charPath = "DUUD";
		assertEquals(1, CountingValleys.countingValleys(numberOfSteps, charPath));
	}

	@Test
	public void testCountingValleysWhen6StepsAndUUUDDD_ShouldReturn0() {
		int numberOfSteps = 6;
		String charPath = "UUUDDD";
		assertEquals(0, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen6StepsAndDDDUUU_ShouldReturn1() {
		int numberOfSteps = 6;
		String charPath = "DDDUUU";
		assertEquals(1, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen6StepsAndUDUDUD_ShouldReturn0() {
		int numberOfSteps = 6;
		String charPath = "UDUDUD";
		assertEquals(0, CountingValleys.countingValleys(numberOfSteps, charPath));
	}
	
	@Test
	public void testCountingValleysWhen6StepsAndDUDUDU_ShouldReturn3() {
		int numberOfSteps = 6;
		String charPath = "DUDUDU";
		assertEquals(3, CountingValleys.countingValleys(numberOfSteps, charPath));
	}

}
