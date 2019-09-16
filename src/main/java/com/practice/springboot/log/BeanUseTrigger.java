package com.practice.springboot.log;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Luo Bao Ding
 * @since 2019/9/10
 */
@RestController
public class BeanUseTrigger {
    private final ShowLogObject showLogObject;

    public BeanUseTrigger(ShowLogObject showLogObject) {
        this.showLogObject = showLogObject;
    }

    @RequestMapping("/trigger")
    private String trigger() {
        return "---ok";
    }
}
