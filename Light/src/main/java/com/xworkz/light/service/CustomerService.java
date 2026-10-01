package com.xworkz.light.service;

import com.xworkz.light.dto.CustomerDTO;

public interface CustomerService {
    public boolean saveAndValidate(CustomerDTO customerDTO);

}
