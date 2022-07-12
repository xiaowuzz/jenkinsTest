package com.test.jenkinstest.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuCh
 * @date 2022/7/12 18:48
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "success";
    }
}
