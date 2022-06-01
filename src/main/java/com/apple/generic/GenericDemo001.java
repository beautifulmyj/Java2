package com.apple.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo001 {
    public static <T> List<T> query(String sql) {
        ArrayList<T> result = new ArrayList<>();
        return result;
    }
}
