package com.sapianos.sapianos.controler;

import com.sapianos.sapianos.repository.DeliveryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeliveryControler {

    private final DeliveryRepository deliveryRepository;

    public DeliveryControler(DeliveryRepository deliveryRepository) {
        this.deliveryRepository = deliveryRepository;
    }

    @RequestMapping("/delivery")
    public String getDelivery(Model model){
        model.addAttribute("delivery",deliveryRepository.findAll());

        return "delivery";
    }
}
