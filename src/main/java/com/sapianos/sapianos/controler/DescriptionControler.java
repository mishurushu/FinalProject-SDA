package com.sapianos.sapianos.controler;

import com.sapianos.sapianos.repository.DescriptionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DescriptionControler {

    private final DescriptionRepository descriptionRepository;

    public DescriptionControler(DescriptionRepository descriptionRepository) {
        this.descriptionRepository = descriptionRepository;
    }

    @RequestMapping("/description")
    public String getDescription(Model model){
        model.addAttribute("description",descriptionRepository.findAll());

        return "description";

    }


}
