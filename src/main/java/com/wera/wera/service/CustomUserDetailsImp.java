package com.wera.wera.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.wera.wera.entities.User;
import com.wera.wera.repositories.UserRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class CustomUserDetailsImp implements UserDetailsService{

    private UserRepository userRepository;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        User user = userRepository.findByEmail(username);

        if(user== null){
            throw new UsernameNotFoundException("User not found with email"+ username);
        }

        List <GrantedAuthority> authorities = new ArrayList<>();

        return new org.springframework.security.core.userdetails.User(user.getEmail(), 
        user.getPassword(), authorities);
    }
}
