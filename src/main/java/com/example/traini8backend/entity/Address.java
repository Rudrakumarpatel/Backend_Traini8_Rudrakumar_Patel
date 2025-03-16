package com.example.traini8backend.entity;

import jakarta.persistence.Embeddable;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;
}

