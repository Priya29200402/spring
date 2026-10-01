package com.xworkz.light.service.Impl;

import com.xworkz.light.dto.CameraDTO;
import com.xworkz.light.service.CameraService;
import org.springframework.stereotype.Component;

@Component
public class CameraServiceImpl implements CameraService {
    public CameraServiceImpl() {
        System.out.println("created CameraServiceImpl");
    }

    @Override
    public boolean validateAndSave(CameraDTO cameraDTO) {
        System.out.println("The validateAndSave method is running.");
        return true;
    }
}
