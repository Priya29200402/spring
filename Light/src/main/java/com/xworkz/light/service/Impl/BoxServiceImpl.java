package com.xworkz.light.service.Impl;

import com.xworkz.light.dto.BoxDTO;
import com.xworkz.light.service.BoxService;
import org.springframework.stereotype.Component;

@Component
public class BoxServiceImpl implements BoxService {
    public BoxServiceImpl() {
        System.out.println("created BoxServiceImpl");
    }

    @Override
    public boolean saveAndValidate(BoxDTO boxDTO) {
        System.out.println("The SaveAndValidate method is running.");
        return true;
    }
}
