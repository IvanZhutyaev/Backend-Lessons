package com.example.demo1.model;
import lombok.*;

import java.sql.Time;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {
    int id;
    String name;
    int age;
    String country;
    String city;
    }
