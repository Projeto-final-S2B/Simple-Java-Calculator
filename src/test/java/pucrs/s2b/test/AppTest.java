package pucrs.s2b.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest {

	@Test
	public void giveWhenThen() {
		Calculator c = new Calculator();
		double num;
		double actual = c.calculateMono(pucrs.s2b.test.Calculator.MonoOperatorModes.square, num = 10.1);
		
		double expected = 102.01;
		assertEquals(expected, actual, 0.1);
	}
	
	@Test
	public void giveWhenThen() {
		Calculator c = new Calculator();
		double num;
		double actual = c.calculateMono(pucrs.s2b.test.Calculator.MonoOperatorModes.square, num = 10.1);
		
		double expected = 102.01;
		assertEquals(expected, actual, 0.1);
	}

}
