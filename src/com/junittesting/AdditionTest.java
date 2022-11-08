package com.junittesting;

import org.junit.Test;

import org.junit.Assert;

public class AdditionTest {

	@Test
	public void AdditionOfTwoNumbers()
	{
		Arithematic add = new Arithematic();
		int result = add.sum(8, 9);
		Assert.assertEquals(10, result);
	}
	
}
