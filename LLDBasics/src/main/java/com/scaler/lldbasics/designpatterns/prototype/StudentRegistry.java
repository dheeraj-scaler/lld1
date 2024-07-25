package com.scaler.lldbasics.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private Map<String, Student> map = new HashMap<>();


    void register(String name, Student st) {
        map.put(name, st);
    }

    Student get(String name) {
        return map.get(name);
    }

}
