/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.game.web;

import com.shop.game.model.User;
import com.shop.game.data.UserRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author mrebrov
 */
@Controller
@RequestMapping("/user")
public class UserController {
    
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepo) {
        this.userRepository = userRepo;
    }
    
    @GetMapping("/")
    public String users(Model model) {
        List<User> userList = new ArrayList<>();
        userRepository.findAll().forEach(x -> userList.add(x));
        model.addAttribute("users", userList);
        return "users";
    }
    
}
