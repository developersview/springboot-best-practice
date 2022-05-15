package com.developersview.FirstSpringBootApp.Controller;

//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pranoy.chakraborty
 * @Date 16/05/22
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",required = false,defaultValue = "World") String name){
        //model.addAttribute("name",name);
        return "Hello "+name;
    }
}
