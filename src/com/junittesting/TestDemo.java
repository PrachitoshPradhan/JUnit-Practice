package com.junittesting;

import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
	
    @Test
	public void TestData()
	{
		String str1 = "Junit";
		String str2 = "Junit";
		String str4 = "Break";
		String str3 = null;
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		int num1 = 5;
		int num2 = 3;
		Integer num3= null;
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		int[] arr3 = {1,2,3,4,9};
		
		//Assert.assertEquals(str1, str2);
		//Assert.assertEquals(str1, str3);
		//Assert.assertEquals(str1, str4);
		//Assert.assertSame(str1, str4);
		//Assert.assertArrayEquals(arr1, arr2);
		//Assert.assertArrayEquals(arr1, arr3);
		//Assert.assertFalse(num2>num1);
		//Assert.assertTrue(num2>num1);
		//Assert.assertNull(str3);
		Assert.assertNull(num3);
	}
}
