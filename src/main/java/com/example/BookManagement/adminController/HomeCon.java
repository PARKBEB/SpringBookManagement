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

    @GetMapping("/Admin/adminBookReturnList")
    public String doAdminBookReturnList() {
        return "/Admin/adminBookReturnList";
    }

    @GetMapping("/Admin/adminBookReturn")
    public String doAdminBookReturn() {
        return "/Admin/adminBookReturn";
    }

    @GetMapping("/Admin/adminBookDetail")
    public String doAdminBookDetail() {
        return "/Admin/adminBookDetail";
    }

    @GetMapping("/Admin/loginPopup")
    public String doLoginPopup() {
        return "/Admin/loginPopup";
    }

}
