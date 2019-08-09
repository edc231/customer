package com.xiaoyu.springboot.demo.cutsomer.cutsomer.hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping(name="/hello")
    public String hello(@RequestParam(name="xiaoyu")String name, Model model){
        model.addAttribute("name",name);
        return  "hello";
    }
}
