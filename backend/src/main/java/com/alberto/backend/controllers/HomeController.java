package com.alberto.backend.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
    
    @GetMapping(value="/")
    public String getHome() {

        return "<!DOCTYPE html>"+
                    "<html lang='en'>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                            "<div style='color:#d2bcbc; background: #fafff4;padding: 30px 100px;position: absolute;left: 50%;top: 50%;transform: translate(-50%, -50%);white-space: nowrap;'>" +
                                "<pre>" + 
                                    "<h3>Welcome</h3>" + 
                                    "<br/>" + 
                                    "To the hope you find it a friendly <b>API</b>" + 
                                    "<br/>" + 
                                    "You may want to take a look at the <a href=''>API guide site.</a>" + 
                                "</pre>" + 
                            "</div>" +
                        "</body>" +
                    "</html>";
    }
    
}