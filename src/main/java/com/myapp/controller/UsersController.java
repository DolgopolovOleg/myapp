package com.myapp.controller;

import com.myapp.entity.User;
import com.myapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showUserForm(Model model) {
        model.addAttribute("message", "Hello");
        return "hello";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String showUsers(Model model){
        User someUser = userService.findById(1);
        model.addAttribute("users", someUser);
        return "users";
    }

}
