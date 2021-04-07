package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberRegisterController {

    @GetMapping("/")
    public String mainPage() {
        return "index.html";
    }

    @GetMapping("/member")
    public String registerMember(Model model) {
        return "member.html";
    }


}
