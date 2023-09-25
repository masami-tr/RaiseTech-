package com.raisetech9.workoutmanagement.service;

import com.raisetech9.workoutmanagement.entitiy.Part;
import com.raisetech9.workoutmanagement.mapper.WorkoutMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class WorkoutService {

    private final WorkoutMapper workoutMapper;

    //constructor injection
    public WorkoutService(WorkoutMapper workoutMapper) {
        this.workoutMapper = workoutMapper;
    }

    public List<Part> getWorkout(){
        List<Part> workout = workoutMapper.findAll();
        return workout;
    }

}
