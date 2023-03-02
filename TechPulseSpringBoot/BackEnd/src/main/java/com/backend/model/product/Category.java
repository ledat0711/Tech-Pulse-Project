package com.backend.model.product;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategory;
    private String name;
    @JsonBackReference
    @OneToMany(mappedBy = "category")
    private Set<Product> deviceSet;

    public Category() {
    }

    public Category(Long idCategory, String name, Set<Product> deviceSet) {
        this.idCategory = idCategory;
        this.name = name;
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

    public Set<Product> getDeviceSet() {
        return deviceSet;
    }

    public void setDeviceSet(Set<Product> deviceSet) {
        this.deviceSet = deviceSet;
    }
}
