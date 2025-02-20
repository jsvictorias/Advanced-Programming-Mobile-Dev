package com.fiap.computacao.aula_java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
class HelloController {
    @GetMapping
    public String sayHello() {
        return "Olá, Spring Boot!";
    }
}