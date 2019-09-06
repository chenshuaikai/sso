package com.clement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: UserController
 * @Author: Clement
 * @Date: 2019/9/3 23:39
 * @Version: 1.0
 * @Description:
 */
@Controller
@RequestMapping(value = "/admin/user")
public class UserController {

    /**
     * 用户管理
     * @return
     */
    @RequestMapping(value = "list")
    public String list() {
        return "user_list";
    }
}
