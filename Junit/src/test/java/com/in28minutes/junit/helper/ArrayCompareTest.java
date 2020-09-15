package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void test() {
int [] num= {1,2,3,5,4};
int [] exp= {1,2,3,4,5};

Arrays.sort(num);
assertArrayEquals(exp,num);

	}
	
	
	@Test(expected = NullPointerException.class)
	public void nullpoiterTest()
	{
		int [] num =null;
		Arrays.sort(num);
		
	}
}
