package com.apple.reflect;

import com.apple.bean.Girl;

public class ReflectPlay001 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Class<Girl> clz = Girl.class;
        Girl girl = clz.newInstance();
        girl.setName("myj");
        girl.setAge(18);
        girl.setCity("beijing");
        girl.setMakeup("Dior");

        System.out.println(girl);

        play001("myj","lss","dxy");
    }

    public static void play001(String... names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}
