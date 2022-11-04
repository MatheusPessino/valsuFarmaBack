package com.api.valsuFarmaBack.services;


import com.api.valsuFarmaBack.domain.LogUpdateProduct;
import com.api.valsuFarmaBack.repositories.LogUpdateProductRepository;
import com.api.valsuFarmaBack.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LogUpdateProductService {

    @Autowired
    private LogUpdateProductRepository logUpdateProductRepository;

    public LogUpdateProduct findById(Integer id) {
        Optional<LogUpdateProduct> obj = logUpdateProductRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<LogUpdateProduct> findAll(){
        return  logUpdateProductRepository.findAll();
    }
}
