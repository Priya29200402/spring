package com.xworkz.light.service;

import com.xworkz.light.dto.BoxDTO;

public interface BoxService {
    public boolean saveAndValidate(BoxDTO boxDTO);
}
