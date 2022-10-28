package com.api.valsuFarmaBack.resources;

import com.api.valsuFarmaBack.domain.Product;
import com.api.valsuFarmaBack.domain.dtos.ProductDTO;
import com.api.valsuFarmaBack.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/service/products")
public class ProductResource {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Integer id){
        Product obj = productService.findById(id);
        return ResponseEntity.ok().body(new ProductDTO(obj));
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll(){
        List<Product> list = productService.findAll();
        List<ProductDTO> listDto = list.stream().map(obj -> new ProductDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> create(@Valid @RequestBody ProductDTO objDto){
        Product newObj = productService.create(objDto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> update(@PathVariable Integer id, @RequestBody ProductDTO objDto){
        Product obj = productService.update(id, objDto);
        return ResponseEntity.ok().body(new ProductDTO(obj));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ProductDTO> delete(@PathVariable Integer id){
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
