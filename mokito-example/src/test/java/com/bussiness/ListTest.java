package com.bussiness;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
		//BDD style
		//given -setup
List<String> listMock = mock(List.class);
given(listMock.get(anyInt())).willReturn("mayur");
//when -the system under test 

String a=listMock.get(0);


//then -asserts

assertThat(listMock.get(0),is("mayur"));

}
	
	@Test
	public void testReturnMultipleValue() {
List listMock = mock(List.class);
when(listMock.size()).thenReturn(2).thenReturn(3);
assertEquals(2, listMock.size());
assertEquals(3, listMock.size());

}
	@Test
	public void testReturnGet() {
List listMock = mock(List.class);
when(listMock.get(anyInt())).thenReturn("Mayur");
assertEquals("Mayur", listMock.get(0));
assertEquals("Mayur", listMock.get(1));

}

}
