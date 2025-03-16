package com.example.traini8backend.dto;

import com.example.traini8backend.entity.Address;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
public class TrainingCenterRequest {
    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Size(min = 12, max = 12)
    private String centerCode;

    @NotNull
    private Address address;

    private Integer studentCapacity;

    private List<String> coursesOffered;

    @Email
    private String contactEmail;

    @Pattern(regexp = "^\\d{10}$", message = "Phone number must be exactly 10 digits")
    private String contactPhone;
}
