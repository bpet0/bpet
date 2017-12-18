package com.bpet.view;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ServiceStatus {

    @RequestMapping("/status")
    @ResponseBody
    String home() {
        return "OK";
    }

}
