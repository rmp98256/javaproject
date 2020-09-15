package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class QuickTest {
	
	@Before
 public void setup()
 {
	 System.out.println("before test");
 }
	@After
 public void setupafter()
 {
	 System.out.println("after test");
 }
	@Test
	public void test1() {
System.out.println("test 1 executed ");
}
	@Test
	public void test2() {
System.out.println("test 2 executed ");
}
}
