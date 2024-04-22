package com.example.trainingCenter.repository;

import com.example.trainingCenter.entity.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainingRepository extends JpaRepository<TrainingCenter, String> {

}
