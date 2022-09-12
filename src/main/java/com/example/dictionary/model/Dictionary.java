package com.example.dictionary.model;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static Map<String,String> dic = new HashMap<>();
    static {
        dic.put("banana","chuoi");
        dic.put("apple","tao");
        dic.put("feet","chan");
        dic.put("head","dau");
    }
}
