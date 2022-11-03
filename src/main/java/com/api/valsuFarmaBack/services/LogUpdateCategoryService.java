package com.api.valsuFarmaBack.services;

import com.api.valsuFarmaBack.domain.LogUpdateCategory;
import com.api.valsuFarmaBack.repositories.LogUpdateCategoryRepository;
import com.api.valsuFarmaBack.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class LogUpdateCategoryService {

    @Autowired
    private LogUpdateCategoryRepository logUpdateCategoryRepository;

    public LogUpdateCategory findById(Integer id) {
        Optional<LogUpdateCategory> obj = logUpdateCategoryRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    public List<LogUpdateCategory> findAll() {
        return logUpdateCategoryRepository.findAll();
    }
}
