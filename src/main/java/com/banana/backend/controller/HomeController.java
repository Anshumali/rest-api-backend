package com.banana.backend.controller;

import com.banana.backend.domain.Shipwreck;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "Welcome to HomePage";
    }

}
