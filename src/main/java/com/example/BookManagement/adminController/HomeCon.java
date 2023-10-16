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

    @GetMapping("/Admin/adminReservation")
    public String doAdminReservation() {
        return "/Admin/adminReservation";
    }

    @GetMapping("/Admin/adminBookInsert")
    public String doAdminBookInsert() {
        return "/Admin/adminBookInsert";
    }
}
