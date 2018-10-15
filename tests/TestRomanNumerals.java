import static org.junit.Assert.*;

import org.junit.Test;

public class TestRomanNumerals {

	private RomanNumerals romanNumerals;
	@Test
	public void test() {
	
		romanNumerals = new RomanNumerals();
		
		//Before implementation of converToInteger of RomanNumerals
		int actual = romanNumerals.convertToInteger("X");
		int expected = 10;
		assertEquals(expected, actual);
		
		int actual1 = romanNumerals.convertToInteger("XX");
		int expected1 = 20;
		assertEquals(expected1, actual1);
		
		assertEquals(3 , romanNumerals.convertToInteger("III"));
		
		assertEquals(2 , romanNumerals.convertToInteger("II"));
		
		assertEquals(1 , romanNumerals.convertToInteger("I"));
		
		assertEquals(4 , romanNumerals.convertToInteger("IV"));
		
		assertEquals(9 , romanNumerals.convertToInteger("IX"));
		
		assertEquals(10 , romanNumerals.convertToInteger("X"));
		
		assertEquals(20 , romanNumerals.convertToInteger("XX"));
		
		assertEquals(30 , romanNumerals.convertToInteger("XXX"));
		
		assertEquals(40 , romanNumerals.convertToInteger("XL"));
		
		assertEquals(50 , romanNumerals.convertToInteger("L"));
		
		assertEquals(60 , romanNumerals.convertToInteger("LX"));
		assertEquals(70 , romanNumerals.convertToInteger("LXX"));
		assertEquals(80 , romanNumerals.convertToInteger("LXXX"));
		
		assertEquals(90 , romanNumerals.convertToInteger("XC"));
		assertEquals(100 , romanNumerals.convertToInteger("C"));
		assertEquals(200 , romanNumerals.convertToInteger("CC"));
		assertEquals(300 , romanNumerals.convertToInteger("CCC"));
		
		assertEquals(400 , romanNumerals.convertToInteger("CD"));
		assertEquals(500 , romanNumerals.convertToInteger("D"));
		assertEquals(600 , romanNumerals.convertToInteger("DC"));
		assertEquals(700 , romanNumerals.convertToInteger("DCC"));
		assertEquals(800 , romanNumerals.convertToInteger("DCCC"));
		assertEquals(900 , romanNumerals.convertToInteger("CM"));
		
		assertEquals(900 , romanNumerals.convertToInteger("CM"));
		
		assertEquals(1000 , romanNumerals.convertToInteger("M"));
		
		assertEquals(2014 , romanNumerals.convertToInteger(" MMXIV"));
		
		assertEquals(1984  , romanNumerals.convertToInteger("MCMLXXXIV"));
		
	}

}
