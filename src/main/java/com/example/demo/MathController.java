package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class MathController {
    @RequestMapping("/sum")
    public MathEntity getSum(@RequestParam(value = "a",defaultValue = "error") double a,
                              @RequestParam(value = "b",defaultValue = "error") double b
                              ){
        double c=a+b;
        return new MathEntity("sum",a,b,c);
    }
    @RequestMapping("/subt")
    public MathEntity getSub(@RequestParam(value = "a",defaultValue = "error") double a,
                              @RequestParam(value = "b",defaultValue = "error") double b
    ){
        double c=a-b;
        return new MathEntity("subtraction",a,b,c);
    }
    @RequestMapping("/mult")
    public MathEntity getMult(@RequestParam(value = "a",defaultValue = "error") double a,
                             @RequestParam(value = "b",defaultValue = "error") double b
    ){
        double c=a*b;
        return new MathEntity("multiplication",a,b,c);
    }
    @RequestMapping("/div")
    public MathEntity getDiv(@RequestParam(value = "a",defaultValue = "error") double a,
                             @RequestParam(value = "b",defaultValue = "error") double b
    ){
        double c=a/b;
        return new MathEntity("division",a,b,c);
    }
}
