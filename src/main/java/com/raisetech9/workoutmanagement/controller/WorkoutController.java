package com.raisetech9.workoutmanagement.controller;


import com.raisetech9.workoutmanagement.service.WorkoutService;
import com.raisetech9.workoutmanagement.entitiy.Part;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkoutController {

    private final WorkoutService workoutService;

    public WorkoutController(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @GetMapping("/workout")
    public List<Part> getWorkout(){
        List<Part> workout = workoutService.getWorkout();
        return workout;
    }

}
