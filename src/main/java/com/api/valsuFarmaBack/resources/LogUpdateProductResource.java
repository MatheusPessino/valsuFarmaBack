package com.api.valsuFarmaBack.resources;

import com.api.valsuFarmaBack.domain.LogUpdateProduct;
import com.api.valsuFarmaBack.domain.dtos.LogUpdateProductDTO;
import com.api.valsuFarmaBack.services.LogUpdateProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/service/log/product/update")
public class LogUpdateProductResource {

    @Autowired
    private LogUpdateProductService logUpdateProductService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<LogUpdateProductDTO> findById(@PathVariable Integer id){
        LogUpdateProduct obj = logUpdateProductService.findById(id);
        return ResponseEntity.ok().body(new LogUpdateProductDTO(obj));
    }

    @GetMapping
    public ResponseEntity<List<LogUpdateProductDTO>> findAll(){
        List<LogUpdateProduct> list = logUpdateProductService.findAll();
        List<LogUpdateProductDTO> listDto = list.stream().map(obj -> new LogUpdateProductDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
}
