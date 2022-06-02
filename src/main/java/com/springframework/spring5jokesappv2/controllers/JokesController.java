package com.springframework.spring5jokesappv2.controllers;

import com.springframework.spring5jokesappv2.services.JokesService;
import com.springframework.spring5jokesappv2.services.impl.JokesServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokesService jokesService;

    public JokesController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("jokes", this.jokesService.getJoke());
        return "index";
    }
}
