package com.aleksandar.jwtspringsecurity.db;

import com.aleksandar.jwtspringsecurity.model.JwtUser;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Aleksandar on 29.10.2019
 */

public class VirtualDatabase {

    private static Map<String, JwtUser> dbUsers = new LinkedHashMap<>();

    static {
        //password for all users is: password
        dbUsers.put("aleksandar", new JwtUser("aleksandar", "$2a$10$cSekeTnKvk9COamO4hjnne6/YjwlTW6KfcWhLPgHbMtxZG4CwBT3y", Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"))));
        dbUsers.put("user", new JwtUser("user", "$2a$10$cSekeTnKvk9COamO4hjnne6/YjwlTW6KfcWhLPgHbMtxZG4CwBT3y", Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER"))));
        dbUsers.put("viewer", new JwtUser("viewer", "$2a$10$cSekeTnKvk9COamO4hjnne6/YjwlTW6KfcWhLPgHbMtxZG4CwBT3y", Collections.singletonList(new SimpleGrantedAuthority("ROLE_VIEWER"))));
        dbUsers.put("admin", new JwtUser("admin", "$2a$10$cSekeTnKvk9COamO4hjnne6/YjwlTW6KfcWhLPgHbMtxZG4CwBT3y", Collections.singletonList(new SimpleGrantedAuthority("ROLE_ADMIN"))));
    }

    public static Map<String, JwtUser> getDbUsers() {
        return dbUsers;
    }
}
