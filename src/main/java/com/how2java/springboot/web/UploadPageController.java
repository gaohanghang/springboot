package com.how2java.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UploadPageController {

    @RequestMapping("/uploadPage")
    public String uploadPage() {
        return "uploadPage";
    }

}
