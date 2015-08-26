package com.vecinnovators;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldServiceTest {

	@Test
	public void testCToF() {
		HelloWorldService service=new HelloWorldService();
		Double actual=(double) 50;
		Double expected=service.cToF((double) 10);
		assertEquals(expected,actual);
	}

}
