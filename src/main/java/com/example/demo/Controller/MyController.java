package com.example.demo.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("createProject")
    public String createProject() {
        return "createProject";
    }
}