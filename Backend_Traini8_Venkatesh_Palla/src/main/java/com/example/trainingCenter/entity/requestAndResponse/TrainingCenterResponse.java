package com.example.trainingCenter.entity.requestAndResponse;

import com.example.trainingCenter.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingCenterResponse {

    private String centerCode;
    private String centerName;
    private Address address;
    private Long studentCapacity;
    private String coursesOffered;
    private String contactEmail;
    private String contactPhone;
}
