package com.organizer.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	public static List<Todo> todos= new ArrayList<Todo>();
	static {
		todos.add(new Todo(1, "Sanjay", "Learn Angular", new Date(), false));
		todos.add(new Todo(2, "Sanjay", "Learn AEM", new Date(), false));
		todos.add(new Todo(3, "Sanjay", "Go to Bengalurur", new Date(), false));
	}
	public List<Todo> getTodos(){
		return todos;
	}
}
