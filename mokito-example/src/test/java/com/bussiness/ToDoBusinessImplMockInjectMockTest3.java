package com.bussiness;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mock;

import com.data.api.ToDoService;
import com.data.api.ToDoServiceStub;
import com.data.bussiness.ToDoBussinessImpl;
//Your first Mockito code! Hurrah!!!
public class ToDoBusinessImplMockInjectMockTest3 {

	@Test
	public void usingAMock() {
		ToDoService toDoServiceMock=mock(ToDoService.class);
		
		List<String> todos= Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance" );
		
		when(toDoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		ToDoBussinessImpl toDoBussinessImpl=new ToDoBussinessImpl(toDoServiceMock);
		
		List<String> filteredTodos=toDoBussinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
	    assertEquals(2, filteredTodos.size());
	    }
	
	@Test
	public void usingAMock1() {
		ToDoService toDoServiceMock=mock(ToDoService.class);
		
		List<String> todos= Arrays.asList();
		
		when(toDoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
		
		ToDoBussinessImpl toDoBussinessImpl=new ToDoBussinessImpl(toDoServiceMock);
		
		List<String> filteredTodos=toDoBussinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
	    assertEquals(0, filteredTodos.size());
	    }

	@Test
	public void usingAMocBDDk() {
		//given
        ToDoService toDoServiceMock=mock(ToDoService.class);
		
		List<String> todos= Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance" );
		
		given(toDoServiceMock.retrieveTodos("Dummy")).willReturn(todos);
		
		ToDoBussinessImpl toDoBussinessImpl=new ToDoBussinessImpl(toDoServiceMock);
		
		//when
		
		toDoBussinessImpl.deleteTodosNotRelatedToSpring("Dummy");
		
		//then
		verify(toDoServiceMock).deleteTodo("Learn to Dance");
		
	    }
	
	
	
	

}
