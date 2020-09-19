package com.mokito;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyString;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;

import org.junit.Test;

public class HamcrestMatchersTest {

	@Test
	public void test() {
	List<Integer> scores= Arrays.asList(99,100,101,105);
	
	//scores has  items 
	assertThat(scores,hasSize(4));
	assertThat(scores,hasItems(99,100));
	assertThat(scores, everyItem(greaterThan(90)));
	
	
	//String
	assertThat("",isEmptyString());
	
	
	//array
	Integer [] marks= {1,2,3,4};
	
	assertThat(marks,arrayWithSize(4));
	
	}
	

}
