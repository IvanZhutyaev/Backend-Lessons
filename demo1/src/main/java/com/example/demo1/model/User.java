package com.example.demo1.model;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    int id;
    String name;
    int age;
    String country;
    String city;
}
