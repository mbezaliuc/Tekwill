package com.tekwill.application.tasklist;

import com.tekwill.application.model.User;
import  com.tekwill.application.model.Task;

import java.util.ArrayList;

public class TodoList {
    private User user;
    private ArrayList<Task> taskArrayList;
    public TodoList(){
        taskArrayList = new ArrayList<>();
    }

    public TodoList(User user, ArrayList<Task> taskArrayList) {
        this.user = user;
        this.taskArrayList = taskArrayList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void setTaskArrayList(ArrayList<Task> taskArrayList) {
        this.taskArrayList = taskArrayList;
    }
}
