package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		StringHelper stringHelper= new StringHelper();
		
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}

}
