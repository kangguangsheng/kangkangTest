package com.kangkang.controller;

import com.kangkang.bean.BookProperties;
import com.kangkang.component.BookComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBookController{

    /**
     *
     */
    @Autowired
    public BookProperties bookProperties;

    @Autowired
    public BookComponent bookComponent;

    @GetMapping("/book/hello")
    public String sayHello() {
        return "Hello， " + bookProperties.getWriter() + " is writing "
                + bookProperties.getName() + " ！";

//        return "Hello， " + bookComponent.getWriter() + " is writing "
//                + bookComponent.getName() + " ！";
    }
}