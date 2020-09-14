package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	StringHelper stringHelper= new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Position() {
		
		
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinfirstPosition() {
		
		
		
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}

}
