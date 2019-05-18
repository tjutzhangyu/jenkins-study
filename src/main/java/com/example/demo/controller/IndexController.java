package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：zy.
 * @ Date       ：Created in 下午7:07 19-5-18
 * @ Description：${description}
 * @ Modified By：
 * @Version: $version$
 */
@RestController
@RequestMapping("/hello")
public class IndexController {


    @GetMapping
    public String hello(){
        return "Hello World";
    }

}
