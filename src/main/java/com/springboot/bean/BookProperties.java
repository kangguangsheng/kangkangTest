package com.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



@Component
@PropertySource("classpath:book.properties")
//@PropertySource("classpath:movie.properties")
public class BookProperties {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 书名
     */
    @Value("${demo3.book.name}")
    private String name;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    /**
     * 作者
     */
    @Value("${demo3.book.writer}")
    private String writer;

    // ... 省略 getter / setter 方法
}