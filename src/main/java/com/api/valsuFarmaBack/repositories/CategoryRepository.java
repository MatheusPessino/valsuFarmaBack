package com.api.valsuFarmaBack.repositories;

import com.api.valsuFarmaBack.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {
}
