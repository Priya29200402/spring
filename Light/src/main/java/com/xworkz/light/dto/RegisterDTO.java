package com.xworkz.light.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RegisterDTO {
    private String firstName;
    private String lastName;
    private String email;
    private long mobile;

    public RegisterDTO() {
        System.out.println("The RegisterDTO is created.");
    }
}
