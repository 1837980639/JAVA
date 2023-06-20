package com;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.DES;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
//        List<String> tables=new ArrayList<>();
//        String[] arr={"1","2"};
//        for(int i=0;i<arr.length;i++){
//            tables.add(arr[i]);
//        }
//        System.out.println(tables);
        String str = "FQTrbDuzXZh7l2gONR1UOUyeKyLiZLIHsmuAUxoB+Zow6skjlh4Oy3+VKwlYeixCsuiebWjRnvs=";
        DES des = SecureUtil.des(StrUtil.utf8Bytes("s2n4x03mJl012tqz"));
        System.out.println(des.encryptBase64("{\"ZJHM\":\"350111198410252915\",\"QLRMC\":\"吴锦辉\"}"));
        des.decryptStr(str);
    }
}
