package com.docker.testingDocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @RequestMapping("/")
    public Map<String,Object> hello(){
        Map<String,Object>m=new HashMap<>();

        m.put("sita","ramu");
        m.put("names", Arrays.asList("jit","balue"));

        return m;

    }


}
