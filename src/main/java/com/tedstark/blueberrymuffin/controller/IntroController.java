package com.tedstark.blueberrymuffin.controller;


import com.tedstark.blueberrymuffin.data.UserRepository;
import com.tedstark.blueberrymuffin.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IntroController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
    @RequestMapping("/person/{name}")
    public String getOneUser(@PathVariable String name, ModelMap modelMap) {
        User user = userRepository.findByName(name);
        modelMap.put("user", user);
        return "user";
    }
    @RequestMapping("/allusers")
    public String getAllUsers(ModelMap modelMap){
        List<User> allusers= userRepository.getAllUsers();
        modelMap.put("allusers", allusers);
        return "allusers";
    }
}
