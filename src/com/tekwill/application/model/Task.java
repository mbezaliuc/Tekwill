package com.tekwill.application.model;

import com.tekwill.application.enums.Status;

import java.time.LocalDateTime;

public class Task {

    private long id;
    private String taskName;
    private LocalDateTime creationDate;
    private LocalDateTime dueDate;
    private User assignee;
    private User author;
    private Status status;
    private static long idCounter = 1;
    {
        id = idCounter++;
        creationDate = LocalDateTime.now();
        status = Status.NO_STARTED;
    }
    public Task(){
        creationDate = LocalDateTime.now();

    }

    public Task( String taskName, LocalDateTime dueDate, User assignee, User author) {

        this.taskName = taskName;
        this.dueDate = dueDate;
        this.assignee = assignee;
        this.author = author;
    }

    public long getId() {
        return id;
    }


    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }


    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", creationDate=" + creationDate +
                ", dueDate=" + dueDate +
                ", assignee=" + assignee +
                ", author=" + author +
                ", status=" + status +
                '}';
    }
}
