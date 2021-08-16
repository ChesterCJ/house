package com.tuying;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjun
 * @version 1.0
 * @date 2021/6/21
 */
@EnableAutoConfiguration
@RestController
public class Appaplication {

    @RequestMapping("hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "hellow + " + name;

    }

    public static void main(String[] args) {
        SpringApplication.run(Appaplication.class);
    }


}
