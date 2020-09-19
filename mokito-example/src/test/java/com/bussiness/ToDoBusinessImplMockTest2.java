package com.bussiness;


import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.data.api.ToDoService;
import com.data.bussiness.ToDoBussinessImpl;
//Your first Mockito code! Hurrah!!!
@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
public class ToDoBusinessImplMockTest2 {

	
	@Mock
	ToDoService toDoServiceMock;
	
	@InjectMocks
	ToDoBussinessImpl toDoBussinessImpl;
	
	@Test
	public void usingAMock() {
		
		List<String> todos= Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance" );
		
		when(toDoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		
		List<String> filteredTodos=toDoBussinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
	    assertEquals(2, filteredTodos.size());
	    }
	
	@Test
	public void usingAMock1() {
		
		List<String> todos= Arrays.asList();
		
		when(toDoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		
		List<String> filteredTodos=toDoBussinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
	    assertEquals(0, filteredTodos.size());
	    }

	@Test
	public void usingAMocBDDk() {
		//given
		
		List<String> todos= Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance" );
		
		given(toDoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
		
		
		//when
		
		toDoBussinessImpl.deleteTodosNotRelatedToSpring("Dummy");
		
		//then
		verify(toDoServiceMock).deleteTodo("Learn to Dance");
		
	    }
	
	
	
	

}
