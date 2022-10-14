package com.ecodation.todoapp.business;


import com.ecodation.todoapp.core.result.DataResult;
import com.ecodation.todoapp.core.result.Result;
import com.ecodation.todoapp.core.result.SuccessDataResult;
import com.ecodation.todoapp.entities.ToDoEntity;
import com.ecodation.todoapp.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoManager implements ToDoService {

    private ToDoRepository toDoRepository;

    @Autowired
    public ToDoManager(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


    @Override
    public DataResult<List<ToDoEntity>> getAll() {
        return new SuccessDataResult("Yapılacaklar Listesi Hazır",this.toDoRepository.findAll());
    }

    @Override
    public Result createToDo(ToDoEntity toDoEntity) {
        return new SuccessDataResult("Planınıza Eklendi ",this.toDoRepository.save(toDoEntity));
    }

    @Override
    public ResponseEntity<String> deleteToDoById(Long id) {
        this.toDoRepository.deleteById(id);
        return ResponseEntity.ok("işlem başarılı");
    }

    @Override
    public ResponseEntity<String> deleteAll() {
        this.toDoRepository.deleteAll();
        return ResponseEntity.ok("Planlar silindi");
    }
}
