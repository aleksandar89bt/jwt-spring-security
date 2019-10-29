package com.aleksandar.jwtspringsecurity.service;

import com.aleksandar.jwtspringsecurity.db.VirtualDatabase;
import com.aleksandar.jwtspringsecurity.model.JwtUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Aleksandar on 28.10.2019
 */

@Service
public class CustomUserDetialsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String, JwtUser> dbUsers = VirtualDatabase.getDbUsers();
        return dbUsers.get(username);
    }
}
