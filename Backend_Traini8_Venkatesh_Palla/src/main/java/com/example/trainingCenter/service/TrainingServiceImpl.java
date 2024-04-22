package com.example.trainingCenter.service;

import com.example.trainingCenter.entity.TrainingCenter;
import com.example.trainingCenter.entity.requestAndResponse.TrainingCenterRequest;
import com.example.trainingCenter.entity.requestAndResponse.TrainingCenterResponse;
import com.example.trainingCenter.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService{


    @Autowired
    TrainingRepository trainingRepository;


    /**
     * Create and save data for the new training center
     */
    public TrainingCenterResponse createTraining(TrainingCenterRequest trainingCenter) {
        TrainingCenter trainingCenter1 = new TrainingCenter();

        trainingCenter1.setCenterCode(trainingCenter.getCenterCode());
        trainingCenter1.setCenterName(trainingCenter.getCenterName());
        trainingCenter1.setContactEmail(trainingCenter.getContactEmail());
        trainingCenter1.setContactPhone(trainingCenter.getContactPhone());
        trainingCenter1.setCoursesOffered(trainingCenter.getCoursesOffered());
        trainingCenter1.setAddress(trainingCenter.getAddress());
        trainingCenter1.setStudentCapacity(trainingCenter.getStudentCapacity());


        trainingRepository.save(trainingCenter1);

        TrainingCenterResponse trainingCenterResponse = new TrainingCenterResponse();
        trainingCenterResponse.setStudentCapacity(trainingCenter1.getStudentCapacity());
        trainingCenterResponse.setCenterCode(trainingCenter1.getCenterCode());
        trainingCenterResponse.setCenterName(trainingCenter1.getCenterName());
        trainingCenterResponse.setAddress(trainingCenter1.getAddress());
        trainingCenterResponse.setContactEmail(trainingCenter1.getContactEmail());
        trainingCenterResponse.setCoursesOffered(trainingCenter1.getCoursesOffered());
        trainingCenterResponse.setContactPhone(trainingCenter1.getContactPhone());

        return trainingCenterResponse;
    }


    /**
     *Get  all the data from training center
     */
    public List<TrainingCenterResponse> getTrainingCenterData() {
       List<TrainingCenter> trainingCenter1 = trainingRepository.findAll();
       List<TrainingCenterResponse> trainingCenterResponses = new ArrayList<>();
       for(TrainingCenter trainingResponse:trainingCenter1)
       {
           TrainingCenterResponse response2 = new TrainingCenterResponse();
           response2.setContactPhone(trainingResponse.getContactPhone());
           response2.setCenterCode(trainingResponse.getCenterCode());
           response2.setCenterName(trainingResponse.getCenterName());
           response2.setAddress(trainingResponse.getAddress());
           response2.setContactEmail(trainingResponse.getContactEmail());
           response2.setStudentCapacity(trainingResponse.getStudentCapacity());
           response2.setCoursesOffered(trainingResponse.getCoursesOffered());
           trainingCenterResponses.add(response2);
       }
       return trainingCenterResponses;

    }
}


