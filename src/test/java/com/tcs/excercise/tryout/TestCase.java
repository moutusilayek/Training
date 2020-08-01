package com.tcs.excercise.tryout;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCase {
	
	
	@Test
	 public void assertAdd() {
		TestNG test=new TestNG();
		assertEquals(10, test.add(5, 5) );
		
	}
	
	
	@Test
	public void assertSub() {
		TestNG test=new TestNG();
		assertEquals(0, test.sub(5, 5) );
	}
	
	

}
