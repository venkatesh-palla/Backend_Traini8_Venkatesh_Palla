package com.example.trainingCenter.controller;
import com.example.trainingCenter.entity.requestAndResponse.TrainingCenterRequest;
import com.example.trainingCenter.entity.requestAndResponse.TrainingCenterResponse;
import com.example.trainingCenter.service.TrainingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/TrainingCenter")
public class TrainingController {

    @Autowired
    TrainingServiceImpl trainingService;


    /**
     * EndPoint to create the data for new  Training center
     */
    @PostMapping("/Create")
    public TrainingCenterResponse create(@RequestBody TrainingCenterRequest trainingCenter)
    {
         return trainingService.createTraining(trainingCenter);

    }



    /**
     * Endpoint to get the list of data of all Training centers
     */
    @GetMapping("/GetDetails")
    public List<TrainingCenterResponse> get()
    {
        return trainingService.getTrainingCenterData();
    }


}
