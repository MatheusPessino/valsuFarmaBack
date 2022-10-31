package com.api.valsuFarmaBack.services;

import com.api.valsuFarmaBack.domain.User;
import com.api.valsuFarmaBack.repositories.UserRepository;
import com.api.valsuFarmaBack.security.UserSS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{
        Optional<User> user = userRepository.findByEmail(email);
        if(user.isPresent()){
            return new UserSS(
                    user.get().getId(),
                    user.get().getEmail(),
                    user.get().getPassword()
            );
        }
        throw new UsernameNotFoundException(email);
    }
}
