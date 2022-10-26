package com.api.valsuFarmaBack.repositories;

import com.api.valsuFarmaBack.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
