package com.alberto.backend;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HomeController {
   
    @RequestMapping("/")
    public String home(){
        return "Hola Mundo en Home!";
    }
}