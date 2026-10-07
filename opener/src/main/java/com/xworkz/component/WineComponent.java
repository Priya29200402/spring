package com.xworkz.component;


import com.xworkz.dto.WineDTO;
import com.xworkz.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/")
public class WineComponent {

    @Autowired
    private WineService wineService;

    public WineComponent() {

        System.out.println("WineComponent is created");
    }

    @PostMapping("/wine")
    public String onClick(Model model, @Valid WineDTO wineDTO, BindingResult bindingResult){
        System.out.println("onClick() method is called\n");

        if(bindingResult.hasErrors()){
            System.out.println("There is validation error, Please check the validation error and correct it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("wineDTO", wineDTO);
        }else{
            System.out.println("There is no validation error, please continue execution of service");
            model.addAttribute("The wine details are "+ wineDTO);
            wineService.validateAndSave(wineDTO);
            model.addAttribute("wineMessage","wine is added successfully");
        }


        return "Wine.jsp";
    }

    @GetMapping("/opener")
    public String opener(){
        System.out.println("opener() method is called");

        return "Wine.jsp";
    }
}
