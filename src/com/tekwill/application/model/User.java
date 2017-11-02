package com.tekwill.application.model;

import com.tekwill.application.enums.UserRoles;

public class User {
    private long id;
    private String firstName;
    private String lastName;
    private UserRoles userRoles;
    private boolean  userStatus;
    private static long idCounter = 1;
    {
        id = idCounter++;
        userRoles = UserRoles.GUEST;
        userStatus = true;
    }
    public User(){}

    public User( String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String firstName, String lastName, UserRoles userRoles, boolean userStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userRoles = userRoles;
        this.userStatus = userStatus;
    }

    public long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isUserStatus() {
        return userStatus;
    }

    public void setUserStatus(boolean userStatus) {
        this.userStatus = userStatus;
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userStatus) {
        this.userRoles = userRoles;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userRoles=" + userRoles +
                ", userStatus=" + userStatus +
                '}';
    }
}
