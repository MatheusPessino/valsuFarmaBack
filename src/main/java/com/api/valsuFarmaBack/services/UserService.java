package com.api.valsuFarmaBack.services;

import com.api.valsuFarmaBack.domain.User;
import com.api.valsuFarmaBack.domain.dtos.UserDTO;
import com.api.valsuFarmaBack.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private BCryptPasswordEncoder encoder;
    @Autowired
    private UserRepository userRepository;

    public User create(UserDTO objDto) {
        objDto.setId(null);
        objDto.setPassword(encoder.encode(objDto.getPassword()));
        return userRepository.save(new User(objDto));
    }
}
