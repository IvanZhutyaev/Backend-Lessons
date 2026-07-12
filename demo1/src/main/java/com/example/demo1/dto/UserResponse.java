package com.example.demo1.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserResponse {
    int id;
    String name;
    int age;
    String country;
    String city;
}
