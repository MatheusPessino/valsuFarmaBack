package com.api.valsuFarmaBack.domain.dtos;

import com.api.valsuFarmaBack.domain.User;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;

    public UserDTO() {
        super();
    }

    public UserDTO(User obj) {
        this.id = obj.getId();
        this.name = obj.getEmail();
        this.email = obj.getEmail();
        this.password = obj.getPassword();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
