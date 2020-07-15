package com.sapianos.sapianos.controler;

import com.sapianos.sapianos.repository.UserTypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserTypeControler {

    private final UserTypeRepository userTypeRepository;

    public UserTypeControler(UserTypeRepository userTypeRepository) {
        this.userTypeRepository = userTypeRepository;
    }

    @RequestMapping("/userType")
    public String getUserType(Model model){
        model.addAttribute("userType",userTypeRepository.findAll());

        return "userType";
    }

}
