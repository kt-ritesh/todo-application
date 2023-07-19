package org.app.controller;

import org.app.entity.todo;
import org.app.service.todoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class todoController {
    @Autowired
    todoService todoservice;

    @GetMapping("all/todo")
    public List<todo> allTodo(){
        return todoservice.allTodo();
    }
    @GetMapping("done/todo")
    public List<todo> AllDoneTodo(){
        return todoservice.doneTodo();
    }
    @GetMapping("undone/todo")
    public List<todo> AllUndoneTodo(){
        return todoservice.undoneTodo();
    }
    @PostMapping("add/todo")
    public String addTodo(@RequestBody todo newTodo){
        return todoservice.addNewTodo(newTodo);
    }
    @PutMapping("todo/{todoId}/{status}")
    public String updateTodoStatus(@PathVariable Integer todoId, @PathVariable boolean status){
        return todoservice.markTodo(todoId, status);
    }
    @DeleteMapping("delete/todo/{todoId}")
    public String deleteTodo(@PathVariable Integer todoId){
        return todoservice.removeTodo(todoId);
    }
}
