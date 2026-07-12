package com.example.demo1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserRequest {
    String name;
    int age;
    String country;
    String city;
}
