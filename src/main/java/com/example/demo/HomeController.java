package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    @GetMapping("/task")
    public String getTasks() {
        return "These are Tasks";
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, from Spring";
    }

    @RestController
    @RequestMapping("/app")
    public class QuerystringController {
        @GetMapping("foo")
        public String getFoo() {
            return "foo";

        }


        @GetMapping("bar")
        public String getBar() {
            return "bar";
        }

        @GetMapping("baz")
        public String getBaz() {
            return "baz";
        }

        @RestController
        @RequestMapping("/math")
        public class mathController {
            @GetMapping("pi")
            public String getPi() {
                return "3.141592653589793";

            }
        }

    }

}




