package com.xworkz.light.service.Impl;

import com.xworkz.light.dto.BiscuitDTO;
import com.xworkz.light.service.BiscuitService;
import org.springframework.stereotype.Component;

@Component
public class BiscuitServiceImpl implements BiscuitService {
    public BiscuitServiceImpl(){
        System.out.println("The BiscuitServiceImpl created. ");
    }

    @Override
    public boolean saveAndValidate(BiscuitDTO biscuitDTO) {
        System.out.println("The SaveAndValidate method is running.");
        return true;
    }
}
