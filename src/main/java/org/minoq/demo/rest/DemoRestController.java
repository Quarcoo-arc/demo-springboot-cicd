package org.minoq.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DemoRestController {

    @GetMapping
    public String showSiteHealth () {
        return "CI/CD is running 🚀";
    }
}
