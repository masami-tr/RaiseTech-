package com.raisetech9.workoutmanagement.entitiy;

public class Part {

    private int id;

    private String part;

   // private String exercise;

    public Part(int id, String part, String exercise) {
        this.id = id;
        this.part = part;
       // this.exercise = exercise;
    }

    public int getId() {
        return id;
    }

    public String getPart() {
        return part;
    }

//public String getExercise() {
      //  return exercise;
   // }
}
