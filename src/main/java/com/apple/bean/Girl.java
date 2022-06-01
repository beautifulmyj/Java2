package com.apple.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Girl extends Person{
    String makeup;

    public Girl(String name, int age, String city, String makeup) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.makeup = makeup;
    }
}
