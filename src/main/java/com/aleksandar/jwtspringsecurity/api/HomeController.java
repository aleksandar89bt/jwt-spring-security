package com.aleksandar.jwtspringsecurity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

/**
 * @author Aleksandar on 28.10.2019
 */
@RestController
public class HomeController {

    @GetMapping("/admin")
    @RolesAllowed("ROLE_ADMIN")
    public String homeAdmin(){
        return "This is home page for admin";
    }

    @GetMapping("/user")
    @RolesAllowed("ROLE_USER")
    public String homeUser(){
        return "This is home page for user";
    }

    @GetMapping("/viewer")
    @RolesAllowed("ROLE_VIEWER")
    public String homeViewer(){
        return "This is home page for viewer";
    }
}
