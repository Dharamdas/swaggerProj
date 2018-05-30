package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String sayHello() {
        return "Swagger Hello World";
    }
}
