package org.example;


import org.example.function.server.serveMain;
import org.example.function.util.create_txt;
import org.example.function.util.read_excl;
import org.example.function.util.sql_create;

public class Main {
    public static void main(String[] args) {
        serveMain serveMain = new serveMain();
        serveMain.Sql_create_main("D:\\桌面\\新增", "DWD_SXBL_SHSYJ_TABLE", 1);
    }
}