package com.example.demojsp2.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/**
 * @author pranoy.chakraborty
 * @Date 21/07/22
 */
@Controller
public class HelloController {
    @GetMapping({"/", "/hello"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="Spring") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
}

