package com.backend.model.user;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer flagDelete;
    @JsonBackReference
    @OneToMany(mappedBy = "userType")
    private Set<User> userSet;

    public UserType() {
    }

    public UserType(Integer id, String name, Integer flagDelete, Set<User> userSet) {
        this.id = id;
        this.name = name;
        this.flagDelete = flagDelete;
        this.userSet = userSet;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(Integer flagDelete) {
        this.flagDelete = flagDelete;
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
