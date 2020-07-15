package com.sapianos.sapianos.controler;

import com.sapianos.sapianos.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserControler {

    private final UserRepository userRepository;

    public UserControler(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("/user")
    public String getUser(Model model){
        model.addAttribute("user",userRepository.findAll());

        return "user";
    }

}
