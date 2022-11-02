package com.api.valsuFarmaBack.services;

import com.api.valsuFarmaBack.domain.LogUpdateBrand;
import com.api.valsuFarmaBack.repositories.LogUpdateBrandRepository;
import com.api.valsuFarmaBack.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LogUpdateBrandService {

    @Autowired
    private LogUpdateBrandRepository logUpdateBrandRepository;

    public LogUpdateBrand findById(Integer id) {
        Optional<LogUpdateBrand> obj = logUpdateBrandRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<LogUpdateBrand> findAll() {
        return logUpdateBrandRepository.findAll();
    }
}
