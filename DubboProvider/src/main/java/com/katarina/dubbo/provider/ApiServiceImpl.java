package com.katarina.dubbo.provider;

import com.katarina.dubbo.api.ApiService;
import org.springframework.stereotype.Service;

/**
 * @author : LiuWeidong
 * @date : 2018/9/8
 */
@Service("apiService")
public class ApiServiceImpl implements ApiService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
