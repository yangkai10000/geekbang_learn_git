package org.geektimes.projects.user.management;

import org.geektimes.projects.user.domain.User;

import java.util.Objects;

public class UserManager implements UserManagerMBean {

    private final User user;

    public UserManager(User user) {
        this.user = user;
    }

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email) {

    }

    @Override
    public String getPhoneNumber() {
        return null;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {

    }

    @Override
    public boolean equals(Object o) {
        return user.equals(o);
    }

    @Override
    public int hashCode() {
        return user.hashCode();
    }

    @Override
    public User getUser() {
        return null;
    }
}
