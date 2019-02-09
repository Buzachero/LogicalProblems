package br.com.buzachero;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EletronicsShopTest {
	
	@Test
	public void testEletronicsShopWhenKeyboard_40_50_60_And_USB_5_8_12_And_b_60_ShouldReturn_58() {
		int[] keyboards = {40, 50, 60};
		int[] usbDrives = {5, 8, 12};
		int budget = 60;
		
		assertEquals(58, EletronicsShop.getMoneySpent(keyboards, usbDrives, budget));
	}
	
	@Test
	public void testEletronicsShopWhenKeyboard_40_50_60_And_USB_5_8_And_b_60_ShouldReturn_58() {
		int[] keyboards = {40, 50, 60};
		int[] usbDrives = {5, 8};
		int budget = 60;
		
		assertEquals(58, EletronicsShop.getMoneySpent(keyboards, usbDrives, budget));
	}
	
	@Test
	public void testEletronicsShopWhenKeyboard_40_50_And_USB_5_8_12_And_b_60_ShouldReturn_58() {
		int[] keyboards = {40, 50};
		int[] usbDrives = {5, 8, 12};
		int budget = 60;
		
		assertEquals(58, EletronicsShop.getMoneySpent(keyboards, usbDrives, budget));
	}
	
	@Test
	public void testEletronicsShopWhenKeyboard_40_50_And_USB_5_10_And_b_60_ShouldReturn_60() {
		int[] keyboards = {40, 50};
		int[] usbDrives = {5, 10};
		int budget = 60;
		
		assertEquals(60, EletronicsShop.getMoneySpent(keyboards, usbDrives, budget));
	}
	
	@Test
	public void testEletronicsShopWhenKeyboard_40_And_USB_5_10_19_And_b_60_ShouldReturn_59() {
		int[] keyboards = {40};
		int[] usbDrives = {5, 10, 19};
		int budget = 60;
		
		assertEquals(59, EletronicsShop.getMoneySpent(keyboards, usbDrives, budget));
	}
	
	@Test
	public void testEletronicsShopWhenKeyboard_50_60_70_And_USB_10_And_b_59_ShouldReturn_Minus_1() {
		int[] keyboards = {50, 60, 70};
		int[] usbDrives = {10};
		int budget = 59;
		
		assertEquals(-1, EletronicsShop.getMoneySpent(keyboards, usbDrives, budget));
	}
	
	@Test
	public void testEletronicsShopWhenKeyboard_50_And_USB_10_And_b_60_ShouldReturn_60() {
		int[] keyboards = {50};
		int[] usbDrives = {10};
		int budget = 60;
		
		assertEquals(60, EletronicsShop.getMoneySpent(keyboards, usbDrives, budget));
	}
	
	@Test
	public void testEletronicsShopWhenKeyboard_50_And_USB_11_And_b_60_ShouldReturn_Minus_1() {
		int[] keyboards = {50};
		int[] usbDrives = {11};
		int budget = 60;
		
		assertEquals(-1, EletronicsShop.getMoneySpent(keyboards, usbDrives, budget));
	}
	
}
