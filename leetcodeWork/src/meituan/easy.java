package meituan;

import java.util.*;


public class easy {
    //罗马数字相加

    /**
     *
     */
    public int luoma(String s){
        int total = luomaValue(s.charAt(0));
        int preNume=luomaValue(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int num = luomaValue(s.charAt(i));
            if(num<=preNume){
                total+=num;
            }else {
                total+=(num-2*preNume);
            }
            preNume=num;
        }
        return total;
    }
    public int luomaValue(char str){
        //存储罗马数字样板
        switch (str){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);
        return hashmap.get(str);
    }

    //贪心算法
    //判断字符是否唯一
    public boolean union(String str){
        System.out.println(str);
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            if(hashMap.containsKey(str.charAt(i))){
                return false;
            }else {
                hashMap.put(str.charAt(i),i);
            }
        }
        return true;
    }
}
