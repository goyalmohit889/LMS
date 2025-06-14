package com.courseservice.model.dto;



public record CourseDTO (

    Long id,
    String name,
    String courseCode,
    String courseDescription,
    Long instructorId
){
}
