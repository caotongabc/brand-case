package com.itheima;

import com.itheima.config.springConfig;
import com.itheima.service.impl.BrandServiceImpl;
import com.itheima.web.servlet.BaseServlet;
import com.itheima.web.servlet.BrandServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import java.io.IOException;

public class app {
    public static void main(String[] args) throws ServletException, IOException {
//        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx= new AnnotationConfigApplicationContext(springConfig.class);
        BrandServiceImpl brandService = (BrandServiceImpl)ctx.getBean("dao1");
        System.out.println(brandService);
        System.out.println(brandService.selectAll());

        BrandServlet brandServlet = (BrandServlet) ctx.getBean("brandServlet2");
        brandServlet.hello();
        brandServlet.selectAll2();


    }
}
