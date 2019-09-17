package com.lovo.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class GotoPageController {
    @RequestMapping("gotoSave")
    public String gotoSave(){
        return "savauser";
    }
}
