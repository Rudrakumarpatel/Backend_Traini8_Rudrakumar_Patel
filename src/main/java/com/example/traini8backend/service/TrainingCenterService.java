package com.example.traini8backend.service;

import com.example.traini8backend.entity.TrainingCenter;
import org.springframework.stereotype.Service;
import com.example.traini8backend.repository.TrainingCenterRepository;
import java.util.List;

@Service
public class TrainingCenterService {
    private final TrainingCenterRepository repository;

    public TrainingCenterService(TrainingCenterRepository repository) {
        this.repository = repository;
    }

    public TrainingCenter saveTrainingCenter(TrainingCenter trainingCenter) {
        return repository.save(trainingCenter);
    }

    public List<TrainingCenter> getAllTrainingCenters() {
        return repository.findAll();
    }
}
