package com.aleksandar.jwtspringsecurity.service;

import com.aleksandar.jwtspringsecurity.model.JwtUser;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * @author Aleksandar on 28.10.2019
 */

@Service
public class CustomUserDetialsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return new JwtUser("aleksandar", "password", Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }
}
