package org.app.service;

import org.app.Repository.todoRepo;
import org.app.entity.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class todoService {
    @Autowired
    todoRepo todorepo;

    public List<todo> allTodo(){
        return todorepo.getAllTodo();
    }

    public List<todo> doneTodo(){
        List<todo> doneTodo = new ArrayList<>();
        for(todo dTodo : todorepo.getAllTodo()){
            if(dTodo.isTodoDone()){
                doneTodo.add(dTodo);
            }
        }
        return doneTodo;
    }

    public List<todo> undoneTodo(){
        List<todo> undoneTodo = new ArrayList<>();
        for(todo unTodo : todorepo.getAllTodo()){
            if(!unTodo.isTodoDone()){
                undoneTodo.add(unTodo);
            }
        }
        return undoneTodo;
    }

    public String addNewTodo(todo newTodo){
        for(todo uTodo : todorepo.getAllTodo()){
            if(newTodo.getTodoId().equals(uTodo.getTodoId())){
                return "This todo id is already exist";
            }
        }
        todorepo.add(newTodo);
        return "new todo added Successfully";
    }

    public String removeTodo(Integer todoId){
        for(todo todo : todorepo.getAllTodo()){
            if(todo.getTodoId().equals(todoId)){
                todorepo.remove(todo);
                return "your todo deleted successfully";
            }
        }
        return "your todo does not exists";
    }

    public String markTodo(Integer todoId, boolean status){
        for(todo myTodo : todorepo.getAllTodo()){
            if(myTodo.getTodoId().equals(todoId)){
                myTodo.setTodoDone(status);
                return "Your todo status updated Successfully";
            }
        }
        return "Your todoId does not exists";
    }
}
