package com.api.valsuFarmaBack.domain.dtos;

import com.api.valsuFarmaBack.domain.Brand;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class BrandDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @NotNull
    private String name;

    public BrandDTO() {
        super();
    }

    public BrandDTO(Brand obj) {
        this.id = obj.getId();
        this.name = obj.getName();
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
}
