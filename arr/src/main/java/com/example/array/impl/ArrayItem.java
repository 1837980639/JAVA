package com.example.array.impl;

import com.example.array.Arr;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayItem implements Arr {
    private int[] array;
    private List<String> list;
    private Set<String> set;
    private Map<String,String> map;
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void save() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println(map);
        System.out.println(properties);
    }
}
