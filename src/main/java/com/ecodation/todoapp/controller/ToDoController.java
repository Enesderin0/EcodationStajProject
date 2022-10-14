package com.ecodation.todoapp.controller;
import com.ecodation.todoapp.business.ToDoManager;
import com.ecodation.todoapp.entities.ToDoEntity;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Log4j2
@RestController
@RequestMapping(value = "/index",method = RequestMethod.GET)
public class ToDoController {

    @Autowired
    private ToDoManager toDoManager;

    // FOR THYMELEAF

    @GetMapping()
    public String homePage(Model model) {
        model.addAttribute("todos",toDoManager.getAll());
        return "index";
    }

    @PostMapping("/post")
    public String save(@Valid @RequestBody ToDoEntity toDoEntity){
        toDoManager.createToDo(toDoEntity);
        return"index";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        this.toDoManager.deleteToDoById(id);
        return "index";
    }

    // FOR REACT
    /*
    @GetMapping("/getall")
    public DataResult<List<ToDoEntity>>  getAll(){
        return this.toDoManager.getAll();
    }

    @PostMapping("/add")
    public Result createToDo(@Valid @RequestBody ToDoEntity toDoEntity, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return new ErrorResult("Plan ekleme başarısız oldu");
        }
            return this.toDoManager.createToDo(toDoEntity);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteToDoById(@PathVariable("id") Long id){
        this.toDoManager.deleteToDoById(id);
        return ResponseEntity.ok("İşlem başarılı");
    }

    @DeleteMapping("/deleteall")
    public ResponseEntity<String> deleteAll(){
        this.toDoManager.deleteAll();
        return ResponseEntity.ok("Planlar silindi");
    }

    */

}
