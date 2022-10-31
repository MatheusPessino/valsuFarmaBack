package com.api.valsuFarmaBack.resources;

import com.api.valsuFarmaBack.domain.User;
import com.api.valsuFarmaBack.domain.dtos.ProductDTO;
import com.api.valsuFarmaBack.domain.dtos.UserDTO;
import com.api.valsuFarmaBack.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.io.Serializable;
import java.net.URI;

@RestController
@RequestMapping(value = "/service/user")
public class UserResource implements Serializable {
    private static final long serialVersionUID = 1L;

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<ProductDTO> create(@Valid @RequestBody UserDTO objDto){
        User newObj = userService.create(objDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }


}
