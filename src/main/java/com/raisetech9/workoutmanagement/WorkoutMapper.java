package com.raisetech9.workoutmanagement;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WorkoutMapper {
    @Select("SELECT part FROM workout")
    List<Part> findAll();

}
