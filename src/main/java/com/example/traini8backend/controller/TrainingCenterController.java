package com.example.traini8backend.controller;

import com.example.traini8backend.entity.TrainingCenter;
import com.example.traini8backend.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {
    private final TrainingCenterService service;

    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TrainingCenter> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
        return ResponseEntity.ok(service.saveTrainingCenter(trainingCenter));
    }

    @GetMapping
    public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
        return ResponseEntity.ok(service.getAllTrainingCenters());
    }
}
