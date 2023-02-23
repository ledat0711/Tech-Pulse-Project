package com.backend.model.device;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;
    private String name;
    private boolean deletedFlag = false;
    @JsonBackReference
    @OneToMany(mappedBy = "category")
    private Set<Device> deviceSet;

    public Category() {
    }

    public Category(Long idCategory, String name, boolean deletedFlag, Set<Device> deviceSet) {
        this.idCategory = idCategory;
        this.name = name;
        this.deletedFlag = deletedFlag;
        this.deviceSet = deviceSet;
    }

    public Long getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Long idCategory) {
        this.idCategory = idCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    public Set<Device> getDeviceSet() {
        return deviceSet;
    }

    public void setDeviceSet(Set<Device> deviceSet) {
        this.deviceSet = deviceSet;
    }
}
