package com.xworkz.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

@Data
@ToString
@Getter
@Setter
public class WineDTO implements Serializable {
    @NotBlank(message = "Company name cannot be blank")
    @Size(min = 3, max = 100, message = "Company name must be between 3 and 100 characters")
    private String companyName;

    @NotBlank(message = "Company address cannot be blank")
    @Size(min = 3, max = 100, message = "Company address must be between 3 and 100 characters")
    private String companyAddress;

    @NotBlank(message = "Manufacturer name cannot be blank")
    @Size(min = 3, max = 100, message = "Manufacturer name must be between 3 and 100 characters")
    private String manufacturerName;

    @NotNull(message = "Manufacture date cannot be null")
    @PastOrPresent(message = "Manufacture date must be in the past or present")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date manufactureDate;

    @NotNull(message = "Age cannot be null")
    @Min(value = 1, message = "Age must be at least 1")
    private Integer age;

    @NotNull(message = "Price cannot be null")
    @DecimalMin(value = "0.0", message = "Price must be at least 0")
    @DecimalMax(value = "1000000.0", message = "Price must be at most 1000000")
    private Double price;
}
