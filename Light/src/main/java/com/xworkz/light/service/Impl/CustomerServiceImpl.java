package com.xworkz.light.service.Impl;

import com.xworkz.light.dto.CustomerDTO;
import com.xworkz.light.service.CustomerService;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    public CustomerServiceImpl() {
        System.out.println("created CustomerServiceImpl");
    }

    @Override
    public boolean saveAndValidate(CustomerDTO customerDTO) {
        System.out.println("The SaveAndValidate method is running.");
        return true;
    }
}
