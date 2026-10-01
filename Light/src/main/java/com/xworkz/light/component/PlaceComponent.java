package com.xworkz.light.component;

import com.xworkz.light.dto.PlaceDTO;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class PlaceComponent {
    public PlaceComponent() {
        System.out.println("The Place is created");
    }

    @RequestMapping("/place")
    public String place(Model model, PlaceDTO placeDTO){
        model.addAttribute("placeMessage","The place is created");
        System.out.println("The PlaceDTO"+placeDTO);
        return "/Place.jsp";
    }
}
