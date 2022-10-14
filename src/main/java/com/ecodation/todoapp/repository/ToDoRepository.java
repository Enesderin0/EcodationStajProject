package com.ecodation.todoapp.repository;

import com.ecodation.todoapp.entities.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDoEntity,Long> {


}
