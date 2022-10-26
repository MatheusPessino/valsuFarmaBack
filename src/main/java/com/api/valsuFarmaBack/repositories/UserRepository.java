package com.api.valsuFarmaBack.repositories;

import com.api.valsuFarmaBack.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
