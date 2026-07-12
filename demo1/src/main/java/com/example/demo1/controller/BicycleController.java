package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bicycle")
public class BicycleController {
    @GetMapping("/bmw")
    String getData(){return "BMW";}
    @GetMapping("/mersedec")
    String getData1(){return "mersedec";}
    @GetMapping("/kamaz")
    String getData2(){return "KAMAZ";}
}
