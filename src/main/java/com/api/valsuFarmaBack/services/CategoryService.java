package com.api.valsuFarmaBack.services;

import com.api.valsuFarmaBack.domain.Category;
import com.api.valsuFarmaBack.domain.dtos.CategoryDTO;
import com.api.valsuFarmaBack.repositories.CategoryRepository;
import com.api.valsuFarmaBack.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    public Category findById(Integer id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Não existe categoria com esse:" + id));
    }
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
    public Category create(CategoryDTO objDto) {
        objDto.setId(null);
        return categoryRepository.save(new Category(objDto));
    }
    public  Category update(Integer id, CategoryDTO objDto) {
        objDto.setId(id);
        Category oldObj = findById(id);
        oldObj = new Category(objDto);
        return categoryRepository.save(oldObj);
    }

    public void delete(Integer id) {
        Category obj = findById(id);
        categoryRepository.deleteById(id);
    }
}
