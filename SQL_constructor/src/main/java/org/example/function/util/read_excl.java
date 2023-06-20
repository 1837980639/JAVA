package org.example.function.util;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class read_excl {
    public String read() {
        try {
            //创建工作簿对象
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream("D:\\桌面\\邓敏龙事项清单（无法绑定）6.8 .xlsx"));
            //获取工作簿下sheet的个数
            int sheetNum = xssfWorkbook.getNumberOfSheets();
//            System.out.println("该excel文件中总共有："+sheetNum+"个sheet");
            //遍历工作簿中的所有数据
            for (int i = 0; i < sheetNum; i++) {
                //读取第i个工作表
                System.out.println("读取第" + (i + 1) + "个sheet");
                XSSFSheet sheet = xssfWorkbook.getSheetAt(i);
                //获取最后一行的num，即总行数。此处从0开始
                int maxRow = sheet.getLastRowNum();
                for (int row = 0; row <= maxRow; row++) {
                    //获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
                    int maxRol = sheet.getRow(row).getLastCellNum();
//                    System.out.println("--------第" + row + "行的数据如下--------");
                    for (int rol = 0; rol < maxRol; rol++) {
                        System.out.print(sheet.getRow(row).getCell(rol) + "  ");
                    }
                    System.out.println();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "1";
    }

    public String[][] readHead(String excelName) {
        XSSFWorkbook xssfWorkbook = null;
        try {
            //创建工作簿对象
            xssfWorkbook = new XSSFWorkbook(new FileInputStream(excelName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取工作簿下sheet的个数
        int sheetNum = xssfWorkbook.getNumberOfSheets();
        //创建存储数组对象
        String[][] sheetArr = new String[(sheetNum + 1)][];
        System.out.println("该excel文件中总共有：" + sheetNum + "个sheet");
        //创建表名称数组
        String[] sheetNameArr = new String[sheetNum];
        //遍历工作簿中的所有数据
        for (int i = 0; i < sheetNum; i++) {
            //读取第i个工作表
            XSSFSheet sheet = xssfWorkbook.getSheetAt(i);
            System.out.println("读取第" + (i + 1) + "个sheet" + sheet.getSheetName());

            //获取最后单元格num，即总单元格数 ***注意：此处从1开始计数***
//            int maxRol = sheet.getRow(0).getLastCellNum();
            int maxRol = sheet.getRow(0).getLastCellNum();
            System.out.println("--------第" + 0 + "行的数据如下--------");
            String[] rolArr = new String[maxRol];

            for (int rol = 0; rol < maxRol; rol++) {
                //存储单元格信息
                rolArr[rol] = sheet.getRow(0).getCell(rol) + "";
                //循环遍历出单元格
                System.out.print(sheet.getRow(0).getCell(rol) + "  ");
            }
            //存储sheet表名称
            sheetNameArr[i] = sheet.getSheetName();
            //存储sheet信息
            sheetArr[i] = rolArr;
            System.out.println();
        }
        sheetArr[sheetNum] = sheetNameArr;
        return sheetArr;
    }
}
