package com.raisetech9.workoutmanagement.mapper;


import com.raisetech9.workoutmanagement.entitiy.Part;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface WorkoutMapper {

    @Select("SELECT * FROM workout")
    List<Part> findAll();

}
