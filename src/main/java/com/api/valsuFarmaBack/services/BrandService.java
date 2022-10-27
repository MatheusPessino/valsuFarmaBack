package com.api.valsuFarmaBack.services;

import com.api.valsuFarmaBack.domain.Brand;
import com.api.valsuFarmaBack.domain.dtos.BrandDTO;
import com.api.valsuFarmaBack.repositories.BrandRepository;
import com.api.valsuFarmaBack.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;
    public Brand findById(Integer id) {
        Optional<Brand> obj = brandRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found" + id));
    }

    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    public Brand create(BrandDTO objDto) {
        objDto.setId(null);
        Brand newObj = new Brand(objDto);
        return brandRepository.save(newObj);
    }

    public Brand update(Integer id, BrandDTO objDto) {
        objDto.setId(id);
        Brand oldObj = findById(id);
        oldObj = new Brand(objDto);
        return brandRepository.save(oldObj);
    }

    public void delete(Integer id) {
        Brand obj = findById(id);
        brandRepository.deleteById(id);
    }
}
