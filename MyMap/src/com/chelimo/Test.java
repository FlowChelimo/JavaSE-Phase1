package com.chelimo;

import java.util.HashMap;

public class Test {
    static void main() {
        HashMap <String,String> map = new HashMap<>();
        map.put("1","one");
        map.put("2","two");
        map.put("3","three");
        System.out.println(map.get("3"));
    }
}
