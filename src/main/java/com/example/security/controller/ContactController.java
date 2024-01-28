package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String saveContactInquiryDetails() {
        return "질문 사항에 대한 정보들을 불러옵니다.";
    }
}
