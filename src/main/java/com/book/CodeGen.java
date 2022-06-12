package com.book;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author Siaze
 * @date 2022/6/12
 */
public class CodeGen {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC", "root", "318675")
                .globalConfig(builder -> {
                    builder.author("Siaze") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\IdeaProjects\\UML\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.book") // 设置父包名
//                            .moduleName("UML") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "E:\\IdeaProjects\\UML\\src\\main\\resources")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("t_simple"); // 设置需要生成的表名
                         //   .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
