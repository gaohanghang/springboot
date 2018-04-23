package com.how2java.springboot.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
public class PageHelperConfig {

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
//        offsetAsPageNum:设置为true时，会将RowBounds第一个参数offset当成pageNum页码使用.
        p.setProperty("offsetAsPageNum", "true");
//        rowBoundsWithCount:设置为true时，使用RowBounds分页会进行count查询.
        p.setProperty("rowBoundsWithCount", "true");
//        reasonable：启用合理化时，如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页。
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
