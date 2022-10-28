package com.api.valsuFarmaBack.services;

import com.api.valsuFarmaBack.domain.Brand;
import com.api.valsuFarmaBack.domain.Category;
import com.api.valsuFarmaBack.domain.Product;
import com.api.valsuFarmaBack.domain.dtos.ProductDTO;
import com.api.valsuFarmaBack.repositories.ProductRepository;
import com.api.valsuFarmaBack.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryService categoryService;
    @Autowired
    private BrandService brandService;


    public Product findById(Integer id) {
        Optional<Product> obj = productRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not Found: " + id));
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product create(ProductDTO objDto) {
        objDto.setId(null);
        return productRepository.save(newProduct(objDto));
    }

    private Product newProduct(ProductDTO objDto){
        Category category = categoryService.findById(objDto.getCategory());
        Brand brand = brandService.findById(objDto.getBrand());

        Product product = new Product();
        if(objDto.getId() != null){
            product.setId(objDto.getId());
        }
        product.setCategory(category);
        product.setBrand(brand);
        product.setName(objDto.getName());
        product.setDescription(objDto.getDescription());
        product.setPrice(objDto.getPrice());
        product.setStock(objDto.getStock());

        return product;
    }

    public Product update(Integer id, ProductDTO objDto) {
        objDto.setId(id);
        Product oldObj = findById(id);
        oldObj = newProduct(objDto);
        return productRepository.save(oldObj);
    }

    public void delete(Integer id) {
        productRepository.deleteById(id);
    }
}

