package com.katarina.dubbo.system;

import com.katarina.dubbo.api.ApiService;
import com.katarina.dubbo.utils.SystemUtils;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LiuWeidong
 * @date : 2018/9/8
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });
        context.start();

        SystemUtils.info("Dubbo consumer start...");

        ApiService service = context.getBean(ApiService.class);
        SystemUtils.info(service.sayHello("LiuWeidong"));
    }
}
