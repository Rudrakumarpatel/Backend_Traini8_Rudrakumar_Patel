package com.example.traini8backend.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import jakarta.validation.constraints.*;

import java.time.Instant;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String centerName;

    @NotBlank
    @Size(min = 12, max = 12)
    private String centerCode;

    @Embedded
    private Address address;

    @Positive
    private int studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private long createdOn = Instant.now().getEpochSecond();

    @Email
    private String contactEmail;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$", message = "Invalid phone number")
    private String contactPhone;
}
