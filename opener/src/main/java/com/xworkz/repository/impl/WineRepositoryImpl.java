package com.xworkz.repository.impl;

import com.xworkz.dto.WineDTO;
import com.xworkz.repository.WineRepository;
import org.springframework.stereotype.Repository;

@Repository
public class WineRepositoryImpl implements WineRepository {

    public WineRepositoryImpl() {

        System.out.println("WineRepositoryImpl Created");
    }

    @Override
    public boolean save(WineDTO wineDTO) {
        System.out.println("save method called in WineRepositoryImpl");
        return true;
    }
}
