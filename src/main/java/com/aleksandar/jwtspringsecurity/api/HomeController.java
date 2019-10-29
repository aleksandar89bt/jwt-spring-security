package com.aleksandar.jwtspringsecurity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

/**
 * @author Aleksandar on 28.10.2019
 */
@RestController
public class HomeController {

    @GetMapping("/home")
    @RolesAllowed("ROLE_ADMIN")
    public String home(){
        return "This is home page";
    }
}
