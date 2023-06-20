package com.example.demo.Agener;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodeGenerator {

    public static void main(String[] args) {
        List<String> tables=new ArrayList<>();
        String[] arr={"bus_info","bus_sign","bus_url","bus_info_history"};
        for(int i=0;i<arr.length;i++){
            tables.add(arr[i]);
        }
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/dt?useUnicode=true&characterEncoding=utf8&useSSL=true", "root", "123456")
                .globalConfig(builder -> {
                    builder.author("秦坤") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .commentDate("yyyy-MM-dd")
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(System.getProperty("user.dir")+"\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example") // 设置父包名
                            .moduleName("demo") // 设置父包模块名
                            .entity("po")//设置实体包
                            .service("service")//设置服务包
                            .serviceImpl("service.impl")//设置服务实现类包
                            .controller("controller")//设置控制包
                            .mapper("mapper")//生成映射包
                            .xml("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir")+"\\src\\resources")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables) // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            .serviceBuilder()//创建service
                            .formatServiceFileName("%sService")//创建service接口名
                            .formatServiceImplFileName("%sServiceImpl")//创建service实现类名
                            .entityBuilder()
                            .enableLombok()//支持lombok
                            .logicDeleteColumnName("delete")//开启逻辑删除
                            .mapperBuilder()
                            .enableBaseResultMap()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .enableMapperAnnotation()
                            .formatXmlFileName("%sMapper")
                            .controllerBuilder()
                            .enableRestStyle();
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }

}