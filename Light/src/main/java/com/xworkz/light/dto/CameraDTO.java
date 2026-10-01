package com.xworkz.light.dto;


import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Setter
@Getter
@ToString
public class CameraDTO {
    @NotNull
    @Size(min = 3, max = 30)
    private String cameraName;

    @NotNull
    @Size(min = 3, max = 30)
    private String brand;

    @NotNull
    @Size(min = 3, max = 30)
    private String model;

    @NotNull
    @Min(value = 0)
    private String price;

    public CameraDTO() {
        System.out.println("created CameraDTO");
    }

}
