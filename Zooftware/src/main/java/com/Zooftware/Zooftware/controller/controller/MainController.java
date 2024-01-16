package com.Zooftware.Zooftware.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String ventana_inicial(){
        return "redirect:/login/mostrar";
    }



}
