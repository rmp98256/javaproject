package com.data.bussiness;
import java.util.ArrayList;
import java.util.List;

import com.data.api.ToDoService;

//ToDoBussinessImpl SUT
//ToDoService Dependecy
public class ToDoBussinessImpl {
	private ToDoService toDoService;

	public ToDoBussinessImpl(ToDoService toDoService) {
		
		this.toDoService = toDoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user)
	{
		List<String> filteredTodos=new ArrayList<String>();
		List<String> todos= toDoService.retrieveTodos(user);
		
		for (String todo:todos) {
			if(todo.contains("Spring"))
			{
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
