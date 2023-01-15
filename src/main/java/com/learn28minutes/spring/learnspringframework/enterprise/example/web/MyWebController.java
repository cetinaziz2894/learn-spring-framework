package com.learn28minutes.spring.learnspringframework.enterprise.example.web;

import com.learn28minutes.spring.learnspringframework.enterprise.example.business.BusinessService;
import com.learn28minutes.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    public BusinessService businessService;

    public MyWebController(BusinessService businessService){
        super();
        System.out.println("Constructor Dependency Injection");
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService(){
        return  businessService.calculateSum();
    }
}
