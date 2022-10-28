package com.api.valsuFarmaBack.domain.dtos;

import com.api.valsuFarmaBack.domain.Product;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;
    @NotNull(message = "Field NAME is required")
    private String name;
    @NotNull(message = "Field DESCRIPTION is required")
    private String description;
    @NotNull(message = "Field PRICE is required")
    private Double price;
    @NotNull(message = "Field STOCK is required")
    private Integer stock;
    @NotNull(message = "Field CATEGORY is required")
    private Integer category;
    @NotNull(message = "Field BRAND is required")
    private Integer brand;
    private String categoryName;
    private String brandName;

    public ProductDTO() {
        super();
    }

    public ProductDTO(Product obj) {
        this.id = obj.getId();
        this.name =obj.getName();
        this.description = obj.getDescription();
        this.price = obj.getPrice();
        this.stock = obj.getStock();
        this.category = obj.getCategory().getId();
        this.brand = obj.getBrand().getId();
        this.categoryName = obj.getCategory().getName();
        this.brandName = obj.getBrand().getName();
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getBrand() {
        return brand;
    }

    public void setBrand(Integer brand) {
        this.brand = brand;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
