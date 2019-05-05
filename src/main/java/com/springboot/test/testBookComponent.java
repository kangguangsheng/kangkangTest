package com.springboot.test;


import com.springboot.component.BookComponent;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class testBookComponent {
    @Autowired
    BookComponent bookComponent;

    @Test
    public void testBookComponent() {
        Assert.assertEquals(bookComponent.getName(),"'Spring Boot 2.x Core Action'");
        Assert.assertEquals(bookComponent.getWriter(),"BYSocket");
    }

}
