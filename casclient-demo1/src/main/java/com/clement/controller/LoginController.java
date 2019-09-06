package com.clement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: LoginController
 * @Author: Clement
 * @Date: 2019/9/4 0:21
 * @Version: 1.0
 * @Description:
 */
@Controller
public class LoginController {

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    /**
     * 登录失败跳转地址
     * @return
     */
    @RequestMapping(value = "/login/fail")
    public String loginFail(Model model) {
        model.addAttribute("msg","账号或者秘密错误");
        return "login";
    }



}
