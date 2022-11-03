package com.api.valsuFarmaBack.domain.dtos;

import com.api.valsuFarmaBack.domain.LogUpdateCategory;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;

public class LogUpdateCategoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dt_update;
    private String name_old;
    private String name_new;
    private String description_old;
    private String description_new;

    public LogUpdateCategoryDTO() {
        super();
    }

    public LogUpdateCategoryDTO(LogUpdateCategory obj) {
        this.id = obj.getId();
        this.dt_update = obj.getDt_update();
        this.name_old = obj.getName_old();
        this.name_new = obj.getName_new();
        this.description_old = obj.getDescription_old();
        this.description_new = obj.getDescription_new();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDt_update() {
        return dt_update;
    }

    public void setDt_update(LocalDate dt_update) {
        this.dt_update = dt_update;
    }

    public String getName_old() {
        return name_old;
    }

    public void setName_old(String name_old) {
        this.name_old = name_old;
    }

    public String getName_new() {
        return name_new;
    }

    public void setName_new(String name_new) {
        this.name_new = name_new;
    }

    public String getDescription_old() {
        return description_old;
    }

    public void setDescription_old(String description_old) {
        this.description_old = description_old;
    }

    public String getDescription_new() {
        return description_new;
    }

    public void setDescription_new(String description_new) {
        this.description_new = description_new;
    }
}
