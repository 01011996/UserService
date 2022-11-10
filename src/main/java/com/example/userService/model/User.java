package com.example.userService.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name="userId")
    int userId;

    @Column(name="userName")
    String userName;

    @Column(name="userRole")
    String userRole;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userId == user.userId && userName.equals(user.userName) && userRole.equals(user.userRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userRole);
    }
}
