package org.app.Repository;

import org.app.entity.todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class todoRepo {
    @Autowired
    private List<todo> todoList;

    public List<todo> getAllTodo(){
        return todoList;
    }
    public void add(todo todo){
        todoList.add(todo);
    }
    public void remove(todo todo){
        todoList.remove(todo);
    }
}
