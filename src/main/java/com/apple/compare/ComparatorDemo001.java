package com.apple.compare;

import com.apple.bean.Girl;

import java.util.ArrayList;
import java.util.Comparator;

public class ComparatorDemo001 {
    public static void main(String[] args) {
        Girl myj = new Girl("Chanel");
        Girl lss = new Girl("Chanel");
        Girl dxy = new Girl("Chanel");

        ArrayList<Girl> girls = new ArrayList<>();
        girls.add(myj);
        girls.add(lss);
        girls.add(dxy);

        for (Girl girl : girls) {
            System.out.println(girl);
        }

        System.out.println("****************");

        girls.sort(new Comparator<Girl>() {
            @Override
            public int compare(Girl o1, Girl o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Girl girl : girls) {
            System.out.println(girl);
        }
    }
}
