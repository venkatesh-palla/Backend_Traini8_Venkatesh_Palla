package com.example.trainingCenter.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TrainingCenter {

    @Id
    @Column(name = "center_code",nullable = false,length = 12)
    @Size(min = 12, max = 12)
    private String centerCode;

    @Column(name = "center_name",nullable = false,length = 40)
    private String centerName;

    @JdbcTypeCode(SqlTypes.JSON)
    private Address address;

    @Column(name = "student_capacity",nullable = false)
    private Long studentCapacity;

    @Column(name = "courses_offered",nullable = false)
    private String coursesOffered;

    @Column(name = "contact_email",nullable = false,unique = true,length = 320)
    @Email()
    private String contactEmail;

    @Column(name="contact_phone",nullable = false,length = 10)
    @Size(min = 10, max = 10)
    private String contactPhone;
 }
