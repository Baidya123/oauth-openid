package com.demo.security.springsecurityauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/rest/hello")
public class MainController {

    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }
}
