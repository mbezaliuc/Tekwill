package com.tekwill.application;

import com.tekwill.application.enums.Status;
import com.tekwill.application.enums.UserRoles;
import com.tekwill.application.model.Task;
import com.tekwill.application.model.User;
import com.tekwill.application.service.TodoListService;
import com.tekwill.application.tasklist.TodoList;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        TodoList milaTodoList = new TodoList();
        User milaUser = new User();

        milaUser.setFirstName("Liudmila");
        milaUser.setLastName("Java");
        milaUser.setUserRoles(UserRoles.ADMIN);
        milaUser.setUserStatus(true);

        milaTodoList.setUser(milaUser);

        Task taskOne  = new Task();
        taskOne.setAssignee(milaUser);
        taskOne.setAuthor(milaUser);
        taskOne.setStatus(Status.NO_STARTED);
        taskOne.setDueDate(taskOne.getCreationDate().plusDays(30));
        taskOne.setTaskName("Focus on Tekwill course!");

        System.out.println(taskOne);
        Task taskTwo = new Task("Go Home",LocalDateTime.of(2012, Month.NOVEMBER,10,17,10), milaUser, milaUser);
        System.out.println("**************\n"+taskTwo);

        User petru = new User("Petru","Covaliov",UserRoles.ADMIN,true);
        System.out.println("**************\n"+petru);

        TodoListService todoListService =  new TodoListService();
        System.out.println(milaTodoList.getTaskArrayList().size());
        if(todoListService.canAddTask(milaTodoList, milaUser))
            todoListService.addTask(milaTodoList,taskOne);
        System.out.println(milaTodoList.getTaskArrayList().size());

        User anonymous = new User();
        anonymous.setUserRoles(UserRoles.GUEST);
        System.out.println("I cant edit " + todoListService.canAddTask(milaTodoList,anonymous));

    }
}
