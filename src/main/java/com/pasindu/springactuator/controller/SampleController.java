package com.pasindu.springactuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/app1")
    public String hellAppFirst(){
        return "<h2> Hello From Application1 </h2>";
    }

    @GetMapping("/app2")
    public String hellAppSecond(){
        return "<h2> Hello From Application2 </h2>";
    }
}
