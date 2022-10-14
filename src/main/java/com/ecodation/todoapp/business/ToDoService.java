package com.ecodation.todoapp.business;

import com.ecodation.todoapp.core.result.DataResult;
import com.ecodation.todoapp.core.result.Result;
import com.ecodation.todoapp.entities.ToDoEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ToDoService {

    //CRUD
    DataResult<List<ToDoEntity>> getAll();
    Result createToDo(ToDoEntity toDoDto);
    ResponseEntity<String> deleteToDoById(Long id);

    ResponseEntity<String> deleteAll();
}
