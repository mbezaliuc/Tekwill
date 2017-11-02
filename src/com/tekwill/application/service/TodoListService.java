package com.tekwill.application.service;

import com.tekwill.application.enums.UserRoles;
import com.tekwill.application.model.Task;
import com.tekwill.application.model.User;
import com.tekwill.application.tasklist.TodoList;

public class TodoListService {
    public TodoList addTask(TodoList todoList, Task task){
        todoList.getTaskArrayList().add(task);
        return todoList;
    }
    public boolean canAddTask(TodoList todoList, User user){
        if(user.getUserRoles() == UserRoles.ADMIN)
            return true;
        if(todoList.getUser().getId() == user.getId())
            return true;
        return false;

    }
}
