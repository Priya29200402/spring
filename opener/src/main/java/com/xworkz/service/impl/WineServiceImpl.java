package com.xworkz.service.impl;

import com.xworkz.dto.WineDTO;
import com.xworkz.repository.WineRepository;
import com.xworkz.service.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WineServiceImpl implements WineService {

    @Autowired
    private WineRepository wineRepository;

    public WineServiceImpl() {
        System.out.println("WineServiceImpl Created");
    }

    @Override
    public boolean validateAndSave(WineDTO wineDTO) {
        System.out.println("validateAndSave method called in WineServiceImpl");
        if (wineDTO == null) {
            System.out.println("WineDTO is null, cannot save");
            return false;
        }
        return wineRepository.save(wineDTO);
    }
}
