package com.kangkang.component;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//@Validated
@Component
@ConfigurationProperties(prefix = "demo3.book")
public class BookComponent {

    /**
     * 书名
     */
//    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    /**
     * 作者
     */
//    @NotNull
    private String writer;

    // ... 省略 getters / setters 方法
}
