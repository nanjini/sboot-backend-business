package com.sboot.backend.business.controller;

import com.sboot.backend.common.api.controller.HelloController;
import com.sboot.backend.common.core.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloBusinessController {
    private static final Logger logger = LogManager.getLogger(HelloController.class);
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        HelloBusinessController.Hello hello = new HelloBusinessController.Hello();
        hello.setName(name);
        logger.info("/hello-api called!");
        return hello;
    }

    @GetMapping("hello-user")
    @ResponseBody
    public User helloUser(@RequestParam("name") String name) {
        User user = new User();
        user.setName(name);
        logger.info("/hello-user called");
        return user;
    }


    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) { this.name = name; }
    }
}
