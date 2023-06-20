package org.example.function.server;

import org.example.function.util.create_txt;
import org.example.function.util.read_excl;
import org.example.function.util.sql_create;

import java.io.File;

public class serveMain {
    private read_excl readExcl = new read_excl();//读取excel对象类
    private sql_create sqlCreate = new sql_create();//sql创建类
    private create_txt createTxt;// 写文件类
    private String[][] sheetArr;// 存储读取出来的表数据
    private String sqlData;// 存储执行sqlCreate的数据

    /**
     * 此函数提供表名+序号的生成
     *
     * @param pthName     读取的文件夹地址
     * @param tableName   需要取的表名
     * @param startLength 表名开始的序号
     */
    public void Sql_create_main(String pthName, String tableName, int startLength) {
        //表示一个文件路径
        File file = new File(pthName);
        //用数组把文件夹下的文件存起来
        File[] files = file.listFiles();

        if (files.length == 1) {//单文件
            sheetArr = readExcl.readHead(files[0].getPath());
            sqlData = sqlCreate.oracle_head_ps(tableName, sheetArr, startLength);
            createTxt = new create_txt(sqlData);
            createTxt.create_txt_string(false);
        } else {//多文件
            //覆盖源文件
            createTxt = new create_txt("");// 创建空文件
            createTxt.create_txt_string(false);// false取消追加，直接覆盖

            //foreach遍历数组
            for (File file2 : files) {
                //打印文件列表：只读取名称使用getName();
                sheetArr = readExcl.readHead(file2.getPath());
                sqlData = sqlCreate.oracle_head_ps(tableName, sheetArr, startLength);
                startLength = sheetArr.length;
                createTxt = new create_txt(sqlData);
                createTxt.create_txt_string(true);//修改模式为文本追加
            }
        }

    }
}
