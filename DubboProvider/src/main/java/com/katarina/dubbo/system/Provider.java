package com.katarina.dubbo.system;

import com.katarina.dubbo.utils.SystemUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author : LiuWeidong
 * @date : 2018/9/8
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
        context.start();

        SystemUtils.info("Dubbo provider start...");

        // waiting
        Integer i = System.in.read();
    }
}
