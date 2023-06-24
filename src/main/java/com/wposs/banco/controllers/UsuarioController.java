package com.wposs.banco.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class UsuarioController {

    @GetMapping("/")
    public String inicio(){
        return "index";
    }
}
