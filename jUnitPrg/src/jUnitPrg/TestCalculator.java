package jUnitPrg;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	@Before
	public void setUp() throws Exception {
		System.out.println("before test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after test");
	}

	@Test
	public final void testAdd() {
		Calculator c=new Calculator();
		assertEquals(30,c.add(10,20));
	}

}
