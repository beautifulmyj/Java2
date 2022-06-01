package com.apple;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Boy {
    String name;
    int age;

    public static void main(String[] args) {
        Boy myj1 = new Boy("myj", 18);
        Boy myj2 = new Boy("myj", 18);
        System.out.println(myj1 == myj2);
    }
}
