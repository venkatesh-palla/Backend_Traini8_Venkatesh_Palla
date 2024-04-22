package com.example.trainingCenter.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @Column(name = "address_id",nullable = false)
    private String addressId;

    @Column(name = "detailed_address",nullable = false)
    private String detailedAddress;

    @Column(name = "city",nullable = false)
    private String city;

    @Column(name = "state",nullable = false)
    private String state;

    @Column(name = "pincode",nullable = false)
    private String pincode;
}
