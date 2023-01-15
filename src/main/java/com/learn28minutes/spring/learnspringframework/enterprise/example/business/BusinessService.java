package com.learn28minutes.spring.learnspringframework.enterprise.example.business;

import com.learn28minutes.spring.learnspringframework.enterprise.example.data.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BusinessService {
    @Autowired
    public DataService dataService;
    public BusinessService(DataService dataService){
        super();
        System.out.println("Consructor Dependency Injection");
        this.dataService = dataService;
    }
    public long calculateSum() {
        List<Integer> data = dataService.getData();
        return data.stream().reduce(Integer::sum).get();
    }
}
