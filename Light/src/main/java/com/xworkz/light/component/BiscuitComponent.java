package com.xworkz.light.component;

import com.xworkz.light.dto.BiscuitDTO;
import com.xworkz.light.service.BiscuitService;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Component
@RequestMapping("/")
public class BiscuitComponent {

    private BiscuitService biscuitService;

    public BiscuitComponent() {
        System.out.println("The BiscuitsComponent is created");
    }

    @PostMapping("/biscuits")
    public String biscuit(Model model, @Valid BiscuitDTO biscuitsDTO, BindingResult bindingResult) {
        System.out.println("The BiscuitDTO:" + biscuitsDTO);

        if (!bindingResult.hasErrors()) {
            System.out.println("There is no validation error, will continue to execute the service");
        } else {
            System.out.println("There is validation error,  please fix it");
            List<ObjectError> errors = bindingResult.getAllErrors();
            model.addAttribute("validationErrors", errors);
            model.addAttribute("biscuitsDTO", biscuitsDTO);
        }


        model.addAttribute("biscuitMessage", "The biscuit is created");
        return "Biscuits.jsp";
    }
}
