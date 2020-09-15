package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	StringHelper stringHelper;
	@Before
	public void before()
	{
		stringHelper= new StringHelper();
	}

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Position() {
		
		
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinfirstPosition() {
		
		
		
		assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSame_1()
	{
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSame_2()
	{
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSame_3()
	{
		assertTrue( stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSame_4()
	{
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}




}
