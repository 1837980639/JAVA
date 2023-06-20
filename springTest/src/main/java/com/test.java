package com;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> tables=new ArrayList<>();
        String[] arr={"1","2"};
        for(int i=0;i<arr.length;i++){
            tables.add(arr[i]);
        }
        System.out.println(tables);
    }
}
