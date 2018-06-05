package com.mxmvc.controller;

import com.mxmvc.model.DbAuthUser;
import com.mxmvc.service.AuthUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.Servlet;

/**
 * http://localhost:8080/auth_users/show/4
 * http://localhost:8080/auth_users/test
 */
@Controller
@RequestMapping("/auth_users")
public class AuthUserController {
    @Autowired
    private AuthUserService authUserService;

    @RequestMapping("/test")
    public ModelAndView test() {
        ModelAndView mav = new ModelAndView("auth_user/index");
        String authUser = authUserService.getByTest();
        mav.addObject("user", authUser);
        return mav;
    }

    @RequestMapping("/show/{id}")
    public ModelAndView show(@PathVariable("id") Integer authUserId) {
        ModelAndView mav = new ModelAndView("auth_user/show");
        DbAuthUser dbAuthUser = authUserService.getById(authUserId);
        mav.addObject("user", dbAuthUser);
        return mav;
    }
}
