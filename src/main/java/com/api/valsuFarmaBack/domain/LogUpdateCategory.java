package com.api.valsuFarmaBack.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class LogUpdateCategory implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dt_update;
    private String name_old;
    private String new_name;
    private String description_old;
    private String description_new;

    public LogUpdateCategory() {
        super();
    }

    public LogUpdateCategory(Integer id, LocalDate dt_update, String name_old, String name_new, String description_old, String description_new) {
        super();
        this.id = id;
        this.dt_update = dt_update;
        this.name_old = name_old;
        this.new_name = name_new;
        this.description_old = description_old;
        this.description_new = description_new;
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
        return new_name;
    }

    public void setName_new(String name_new) {
        this.new_name = name_new;
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
