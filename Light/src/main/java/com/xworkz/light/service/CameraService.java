package com.xworkz.light.service;

import com.xworkz.light.dto.CameraDTO;

public interface CameraService {
    boolean validateAndSave(CameraDTO cameraDTO);
}
