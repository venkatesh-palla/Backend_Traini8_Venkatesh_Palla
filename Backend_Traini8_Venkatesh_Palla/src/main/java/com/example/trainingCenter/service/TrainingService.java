package com.example.trainingCenter.service;

import com.example.trainingCenter.entity.requestAndResponse.TrainingCenterRequest;
import com.example.trainingCenter.entity.requestAndResponse.TrainingCenterResponse;
import java.util.List;

public interface TrainingService {


    public TrainingCenterResponse createTraining(TrainingCenterRequest trainingCenter);

    public List<TrainingCenterResponse> getTrainingCenterData();
}
