package com.api.valsuFarmaBack.resources;

import com.api.valsuFarmaBack.domain.LogUpdateBrand;
import com.api.valsuFarmaBack.domain.dtos.BrandDTO;
import com.api.valsuFarmaBack.domain.dtos.LogUpdateBrandDTO;
import com.api.valsuFarmaBack.services.LogUpdateBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/service/log/brand/update")
public class LogUpdateBrandResource {

    @Autowired
    private LogUpdateBrandService logUpdateBrandService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<LogUpdateBrandDTO> findById(@PathVariable Integer id){
        LogUpdateBrand obj = logUpdateBrandService.findById(id);
        return ResponseEntity.ok().body(new LogUpdateBrandDTO(obj));
    }

    @GetMapping
    public ResponseEntity<List<LogUpdateBrandDTO>> findAll(){
        List<LogUpdateBrand> list = logUpdateBrandService.findAll();
        List<LogUpdateBrandDTO> listDto = list.stream().map(obj -> new LogUpdateBrandDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

}
