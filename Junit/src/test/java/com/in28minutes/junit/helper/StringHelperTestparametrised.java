package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTestparametrised {
	StringHelper stringHelper= new StringHelper();
	
	
	private String input;
	private String output;
	
	public StringHelperTestparametrised(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	
	
	
	@Parameters
	public static Collection<String[]> testConditions()
	{
		String expectedoutput[][]= {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedoutput);
	}
	
	

	@Test
	public void testTruncateAInFirst2Positions_Ainfirst2Position() {
		
		
		assertEquals(output, stringHelper.truncateAInFirst2Positions(input));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinfirstPosition() {
		
		
		
		assertEquals(output, stringHelper.truncateAInFirst2Positions(input));
	}
	
	
	//I am expecting false result from this string 
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSame_1()
	{
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	
	// I am execting false from pasing A 
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSame_2()
	{
		assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	
	//I am execting true bcoz ab and ab are same so first and alt are same 
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSame_3()
	{
		assertTrue( stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	//for AB its true 
	@Test
	public void TestAreFirstAndLastTwoCharactersTheSame_4()
	{
		assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
	}




}
