package com.example.trainingCenter.entity.requestAndResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {

    private String addressId;
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;
}
