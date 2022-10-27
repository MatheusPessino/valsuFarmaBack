package com.api.valsuFarmaBack.domain.dtos;

import com.api.valsuFarmaBack.domain.Category;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class CategoryDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    @NotNull(message = "Field NAME is required")
    private String name;
    @NotNull(message = "Field DESCRIPTION is required")
    private String Description;

    public CategoryDTO() {
        super();
    }

    public CategoryDTO(Category obj) {
        this.id = obj.getId();
        this.name = obj.getName();
        Description = obj.getDescription();
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}

