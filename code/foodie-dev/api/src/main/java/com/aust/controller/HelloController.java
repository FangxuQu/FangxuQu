package com.aust.controller;

import com.imooc.demo.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping("hello")
    @ResponseBody
    public Object Hello(){

        demo demo =new demo();
        demo.setDescription("打个招呼吧！ ");
        return demo.getDescription()+"Hello World";
    }
}
