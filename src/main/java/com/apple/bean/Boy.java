package com.apple.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Boy extends Person{
    String sport;

    public Boy(String name, int age, String city, String sport) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.sport = sport;
    }
}
