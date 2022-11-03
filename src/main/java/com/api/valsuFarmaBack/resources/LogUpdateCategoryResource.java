package com.api.valsuFarmaBack.resources;

import com.api.valsuFarmaBack.domain.LogUpdateCategory;
import com.api.valsuFarmaBack.domain.dtos.LogUpdateCategoryDTO;
import com.api.valsuFarmaBack.services.LogUpdateCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/service/log/category/update")
public class LogUpdateCategoryResource {

    @Autowired
    private LogUpdateCategoryService logUpdateCategoryService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<LogUpdateCategoryDTO> findById(@PathVariable Integer id){
        LogUpdateCategory obj = logUpdateCategoryService.findById(id);
        return ResponseEntity.ok().body(new LogUpdateCategoryDTO(obj));
    }

    @GetMapping
    public ResponseEntity<List<LogUpdateCategoryDTO>> findAll(){
        List<LogUpdateCategory> list = logUpdateCategoryService.findAll();
        List<LogUpdateCategoryDTO> listDto = list.stream().map(obj -> new LogUpdateCategoryDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
}
