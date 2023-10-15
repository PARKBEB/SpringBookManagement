package com.example.BookManagement.adminController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCon {
    @GetMapping("/")
    public String doHome() {
        return "/Admin/adminMain";
    }
}
