package com.example.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bicycle1")
public class BicycleController1 {
    @GetMapping("/bmw1")
    String getData(){return "BMW1";}
    @GetMapping("/mersedec1")
    String getData1(){return "mersedec1";}
    @GetMapping("/kamaz1")
    String getData2(){return "KAMAZ1";}
}
