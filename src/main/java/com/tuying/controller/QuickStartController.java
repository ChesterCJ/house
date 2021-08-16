package com.tuying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenjun
 * @version 1.0
 * @date 2021/6/18
 */
@Controller
@RequestMapping("/users")
public class QuickStartController {

    @ResponseBody
    @RequestMapping("/index")
    public String quick() {
        return "chester 个人博客!";
    }

}
