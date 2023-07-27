package com.upgrad.bookmyconsultation.repository;

import com.upgrad.bookmyconsultation.entity.Rating;
import com.upgrad.bookmyconsultation.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//mark it as repository
//create an interface RatingsRepository that extends CrudRepository
@Repository
public interface RatingsRepository extends CrudRepository<Rating, String> {

   // List<User> findByDoctorId();

    //create a method findByDoctorId that returns a list of type Rating
    //define method parameter doctorId of type String
    public List<Rating> findByDoctorId(String doctorId);

}



