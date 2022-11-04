package com.api.valsuFarmaBack.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDate;
@Entity
public class LogUpdateProduct implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dt_update;
    private String name_old;
    private String name_new;
    private String description_old;
    private String description_new;
    private Double price_old;
    private Double price_new;
    private Integer stock_old;
    private Integer stock_new;
    private Integer category_old;
    private Integer category_new;
    private Integer brand_old;
    private Integer brand_new;

    public LogUpdateProduct() {
        super();
    }

    public LogUpdateProduct(Integer id, LocalDate dt_update, String name_old, String new_name, String description_old, String description_new, Double price_old, Double price_new, Integer stock_old, Integer stock_new, Integer category_old, Integer category_new, Integer brand_old, Integer brand_new) {
        this.id = id;
        this.dt_update = dt_update;
        this.name_old = name_old;
        this.name_new = new_name;
        this.description_old = description_old;
        this.description_new = description_new;
        this.price_old = price_old;
        this.price_new = price_new;
        this.stock_old = stock_old;
        this.stock_new = stock_new;
        this.category_old = category_old;
        this.category_new = category_new;
        this.brand_old = brand_old;
        this.brand_new = brand_new;
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

    public String getNew_name() {
        return name_new;
    }

    public void setNew_name(String new_name) {
        this.name_new = new_name;
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

    public Double getPrice_old() {
        return price_old;
    }

    public void setPrice_old(Double price_old) {
        this.price_old = price_old;
    }

    public Double getPrice_new() {
        return price_new;
    }

    public void setPrice_new(Double price_new) {
        this.price_new = price_new;
    }

    public Integer getStock_old() {
        return stock_old;
    }

    public void setStock_old(Integer stock_old) {
        this.stock_old = stock_old;
    }

    public Integer getStock_new() {
        return stock_new;
    }

    public void setStock_new(Integer stock_new) {
        this.stock_new = stock_new;
    }

    public Integer getCategory_old() {
        return category_old;
    }

    public void setCategory_old(Integer category_old) {
        this.category_old = category_old;
    }

    public Integer getCategory_new() {
        return category_new;
    }

    public void setCategory_new(Integer category_new) {
        this.category_new = category_new;
    }

    public Integer getBrand_old() {
        return brand_old;
    }

    public void setBrand_old(Integer brand_old) {
        this.brand_old = brand_old;
    }

    public Integer getBrand_new() {
        return brand_new;
    }

    public void setBrand_new(Integer brand_new) {
        this.brand_new = brand_new;
    }
}
