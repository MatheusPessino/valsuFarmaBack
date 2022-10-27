package com.api.valsuFarmaBack.resources;

import com.api.valsuFarmaBack.domain.Brand;
import com.api.valsuFarmaBack.domain.dtos.BrandDTO;
import com.api.valsuFarmaBack.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/service/brand")
public class BrandResource {

    @Autowired
    private BrandService brandService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<BrandDTO> findById(@PathVariable Integer id){
        Brand obj = brandService.findById(id);
        return ResponseEntity.ok().body(new BrandDTO(obj));
    }

    @GetMapping
    public ResponseEntity<List<BrandDTO>> findAll(){
        List<Brand> list = brandService.findAll();
        List<BrandDTO> listDto = list.stream().map(obj -> new BrandDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping
    public ResponseEntity<BrandDTO> create(@Valid @RequestBody BrandDTO objDto){
        Brand newObj = brandService.create(objDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<BrandDTO> update(@PathVariable Integer id, @RequestBody BrandDTO objDto){
        Brand obj = brandService.update(id, objDto);
        return ResponseEntity.ok().body(new BrandDTO(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<BrandDTO> delete(@PathVariable Integer id){
        brandService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
