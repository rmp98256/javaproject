package com.bussiness;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.data.api.ToDoService;
import com.data.api.ToDoServiceStub;
import com.data.bussiness.ToDoBussinessImpl;

public class ToDoBusinessImplStubTest {

	@Test
	public void usingAStub() {
		ToDoService toDoServiceStub=new ToDoServiceStub() ;
		
		ToDoBussinessImpl toDoBussinessImpl=new ToDoBussinessImpl(toDoServiceStub);
		
		List<String> filteredTodos=toDoBussinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
	    assertEquals(2, filteredTodos.size());
	    }
	
	

}
