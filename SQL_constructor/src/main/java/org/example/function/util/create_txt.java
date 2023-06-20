package org.example.function.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class create_txt {
    private String data = "";

    public create_txt() {

    }

    public create_txt(String data) {
        this.data = data;
    }

    public void create_txt_string(boolean mode) {
        try {
            File writeName = new File("D:\\data.txt"); // 相对路径，如果没有则要建立一个新的output.txt文件
            if (!writeName.exists()) {
                writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
            }
            FileWriter writer = new FileWriter(writeName, mode);
            BufferedWriter out = new BufferedWriter(writer);
            out.write(this.data);
            out.flush(); // 把缓存区内容压入文件    out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
