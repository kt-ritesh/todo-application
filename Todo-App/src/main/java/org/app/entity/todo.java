package org.app.entity;

public class todo {
    private Integer todoId;
    private String todoName;
    private boolean isTodoDone;

    public Integer getTodoId() {
        return todoId;
    }

    public void setTodoId(Integer todoId) {
        this.todoId = todoId;
    }

    public String getTodoName() {
        return todoName;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public boolean isTodoDone() {
        return isTodoDone;
    }

    public void setTodoDone(boolean todoDone) {
        isTodoDone = todoDone;
    }
}
