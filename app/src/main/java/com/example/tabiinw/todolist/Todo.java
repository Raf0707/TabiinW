package com.example.tabiinw.todolist;

public class Todo {
    private String todoText;
    private String todoTitle;

    private enum State{
        COMPLETE,
        NOT_COMPLETED
    }

    public Todo(String todoText,String todoTitle){
        this.todoText = todoText;
        this.todoTitle = todoTitle;
    }

    public String getTodoText() {
        return todoText;
    }

    public void setTodoText(String todoText) {
        this.todoText = todoText;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoText='" + todoText + '\'' +
                ", todoTitle='" + todoTitle + '\'' +
                '}';
    }
}
