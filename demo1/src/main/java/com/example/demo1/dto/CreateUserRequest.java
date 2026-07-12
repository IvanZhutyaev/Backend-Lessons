package com.example.demo1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequest {
    String name;
    int age;
    String country;
    String city;
}
