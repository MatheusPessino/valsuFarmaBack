package com.api.valsuFarmaBack.repositories;

import com.api.valsuFarmaBack.domain.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository  extends JpaRepository<Brand, Integer> {
}
