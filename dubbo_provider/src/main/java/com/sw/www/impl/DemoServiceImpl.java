package com.sw.www.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.sw.www.DemoService;

@Service
public class DemoServiceImpl implements DemoService{  
    public void sayHello() {  
        System.out.println("HIHIHI!");  
    }  
}  
