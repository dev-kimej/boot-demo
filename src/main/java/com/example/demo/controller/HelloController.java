package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String HelloWorld() {
        return "Hello World";
    }

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public Map HelloWorldName(@PathVariable String name) {
        Map<String, Object> result = new HashMap<>();

        result.put("name", name);
        result.put("greet", "Nice to meet you !");

        return result;
    }
}
