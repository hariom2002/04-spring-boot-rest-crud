package com.spring_boot_rest_crud.rest_crud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoRestController {


    @GetMapping("/hello")
    public String GetHello(){
        return "hello world";
    }

}
